package com.mir.big.data.test.service;

import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

/**
 * <p>Create time: 2019/4/15 9:31 PM</p>
 *
 * @author 周光兵
 */
public class ForTest {
    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            System.out.println("======="+ThreadLocalRandom.current().nextInt(4) + "=======");

            for (int j = 0; j < 1; j++) {
                System.out.println(i * 10 + (j + 1));
            }
        }
    }
}
