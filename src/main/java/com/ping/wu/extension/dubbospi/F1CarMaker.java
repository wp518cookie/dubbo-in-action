package com.ping.wu.extension.dubbospi;

import org.apache.dubbo.common.URL;

/**
 * @author wuping
 * @date 2019-05-29
 */

public class F1CarMaker implements CarMaker {
    private WheelMaker wheelMaker;

    @Override
    public String make(URL url) {
        return "F1 car with " + wheelMaker.make(url);
    }

    public WheelMaker getWheelMaker() {
        return wheelMaker;
    }

    public void setWheelMaker(WheelMaker wheelMaker) {
        this.wheelMaker = wheelMaker;
    }
}
