package com.ping.wu.extension.dubbospi;

import org.apache.dubbo.common.URL;

/**
 * @author wuping
 * @date 2019-05-29
 */

public class RaceCarMaker implements CarMaker {

    private WheelMaker wheelMaker;

    @Override
    public String make(URL url) {
        return null;
    }

    public WheelMaker getWheelMaker() {
        return wheelMaker;
    }

    public void setWheelMaker(WheelMaker wheelMaker) {
        this.wheelMaker = wheelMaker;
    }
}
