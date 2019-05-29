package com.ping.wu.extension.jdkspi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author wuping
 * @date 2019-05-29
 */

public class JdkSpiTest {
    public static void main(String[] args) {
        ServiceLoader<Person> persons = ServiceLoader.load(Person.class);
        Iterator<Person> it = persons.iterator();
        while (it.hasNext()) {
            Person person = it.next();
            person.saySomething();
        }
    }
}
