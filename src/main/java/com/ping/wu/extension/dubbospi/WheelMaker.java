package com.ping.wu.extension.dubbospi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author wuping
 * @date 2019-05-29
 */
@SPI("racecarwheelmaker")
public interface WheelMaker {
    @Adaptive
    String make(URL url);
}
