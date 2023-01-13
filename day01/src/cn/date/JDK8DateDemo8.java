package cn.date;

import java.time.LocalDateTime;

/**
 * JDK8 时间类修改时间
 */
public class JDK8DateDemo8 {
    public static void main(String[] args) {
        //public LocalDateTime withYear(int year)   修改年
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 13, 14, 15);
       // LocalDateTime newLocalDateTime = localDateTime.withYear(2048);
       // System.out.println(newLocalDateTime);

        LocalDateTime newLocalDateTime = localDateTime.withMonth(2);
        System.out.println(newLocalDateTime);

    }
}
