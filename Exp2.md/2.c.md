Online Shopping using Enumeration:

// Java program to create an enum for Order Status

enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

public class Main {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;

        System.out.println("Order Status: " + status);
    }
}

OUTPUT:
<img width="162" height="19" alt="Screenshot 2026-08-13 112406" src="https://github.com/user-attachments/assets/f15891c2-5c67-4300-8467-32cba2f4bc5c" />

