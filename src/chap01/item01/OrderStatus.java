package chap01.item01;

public enum OrderStatus {
    // enum 내에 값은 인스턴스가 반드시 하나만 생김(singleton)
    PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);

    private int number;

    OrderStatus(int number) {
        this.number = number;
    }


}
