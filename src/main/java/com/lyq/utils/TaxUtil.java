package com.lyq.utils;


/**
 * @Author liuyiqiang
 * @Date 2018/9/1 10:30
 * @Version 1.0
 */
public final class TaxUtil {

    public static double getTax(double money) {
        if(money <= 5000) {
            return 0;
        }
        if(money <= 8000) {
            return (money - 5000) * 3 / 100;
        }
        if(money <= 17000) {
            return (money - 8000) * 10 / 100 + 90;
        }
        if(money <= 30000) {
            return (money - 17000) * 20 / 100 + 990;
        }
        if(money <= 40000) {
            return (money - 30000) * 25 / 100 + 3590;
        }
        if(money <= 60000) {
            return (money - 40000) * 30 / 100 + 6090;
        }
        if(money <= 85000) {
            return (money - 60000) * 35 / 100 + 12090;
        }
        return (money - 85000) * 45 / 100 + 20840;
    }
}
