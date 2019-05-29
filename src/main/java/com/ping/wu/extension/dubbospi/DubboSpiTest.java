package com.ping.wu.extension.dubbospi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author wuping
 * @date 2019-05-29
 */

public class DubboSpiTest {
    public static void main(String[] args) {
//        testSpi();
//        testAdaptive();
        testAdaptiveSetter();
    }

    private static void testSpi() {
//        WheelMaker wheelMaker = ExtensionLoader.getExtensionLoader(WheelMaker.class).getDefaultExtension();
        WheelMaker wheelMaker = ExtensionLoader.getExtensionLoader(WheelMaker.class).getExtension("f1carwheelmaker");
        System.out.println(wheelMaker.make(getMockURL(null, null)));
    }

    private static void testAdaptive() {
        WheelMaker wheelMaker = ExtensionLoader.getExtensionLoader(WheelMaker.class).getAdaptiveExtension();
        System.out.println(wheelMaker.make(getMockURL("wheel.maker", "racecarwheelmaker")));
    }

    private static void testAdaptiveSetter() {
        CarMaker carMaker = ExtensionLoader.getExtensionLoader(CarMaker.class).getExtension("f1carmaker");
        System.out.println(carMaker.make(getMockURL("wheel.maker", "f1carwheelmaker")));
        System.out.println(carMaker.make(getMockURL("wheel.maker", "racecarwheelmaker")));
    }

    private static URL getMockURL(String key, String value) {
        URL url = new URL("dubbo", "127.0.0.1", 8080);
        if (key != null) {
            url = url.addParameter(key, value);
        }
        return url;
    }
}
