package api.date;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate last = LocalDate.of(2026, 10, 9);
        System.out.println(today);
        System.out.println(last);
        System.out.println("是否是同一天：" + today.isEqual(last));
        System.out.println(today.plusDays(7));
    }
}
