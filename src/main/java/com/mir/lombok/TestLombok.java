package com.mir.lombok;

import com.google.gson.Gson;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 主方法入口
 * <p>Create time: 2018/12/26 10:55 PM</p>
 *
 * @author 周光兵
 */
public class TestLombok {
    public static void main(String[] args) {

        List<CustomerOrder> customerOrders = new ArrayList<>();

        int limit = 5;

        for (int i = 0; i < limit; i++) {
            CustomerOrder customerOrder = new CustomerOrder();
            customerOrder.setOrderNo(String.valueOf(i));
            customerOrder.setCreateTime(LocalDateTime.now());
            customerOrder.setRemark("test" + i);

            if (i % 2 == 0) {
                BigDecimal totalPrice = BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble());

                customerOrder.setTotalPrice(totalPrice);
            }

            customerOrders.add(customerOrder);
        }

        System.out.println("=======================JSON=======================");
        System.out.println(new Gson().toJson(customerOrders));

        System.out.println("=======================toString=======================");
        System.out.println(customerOrders);
    }
}