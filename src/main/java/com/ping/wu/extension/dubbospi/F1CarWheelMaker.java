package com.ping.wu.extension.dubbospi;

import org.apache.dubbo.common.URL;

/**
 * @author wuping
 * @date 2019-05-29
 */

public class F1CarWheelMaker implements WheelMaker {
    @Override
    public String make(URL url) {
        return "F1-car-wheel";
    }
}
