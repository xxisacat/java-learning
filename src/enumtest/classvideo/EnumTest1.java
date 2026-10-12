package enumtest.classvideo;

public class EnumTest1 {
    public static void main(String[] args) {
        OrderState o1 = OrderState.PAYMENT_PENDING;
        System.out.println(o1.getLabel());
        switch (o1) {
            case PAYMENT_PENDING -> System.out.println("Payment is pending");
            case PROCESSING -> System.out.println("Order is being processed");
            case SHIPPED -> System.out.println("Order has been shipped");
            case OUT_FOR_DELIVERY -> System.out.println("Order is out for delivery");
            case DELIVERED -> System.out.println("Order has been delivered");
            case CANCELLED -> System.out.println("Order has been cancelled");
        }
        OrderState[] arr = OrderState.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        OrderState state = OrderState.valueOf("PAYMENT_PENDING");
        System.out.println(state);
    }
}
