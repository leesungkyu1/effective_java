package chap01.item01;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    //Type-Safety 보장 (타입 안정성)
    private OrderStatus orderStatus;

    public static Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        //JVM에 한개의 인스턴스만 올라가있을 수 있기 때문에 비교는 == 연산자로 진행
        Order order = new Order();
        //npe로부터 안전
        if(order.orderStatus == OrderStatus.DELIVERED){
            System.out.println("delivered");
        }

        //EnumMap
        EnumMap<OrderStatus, Integer> enumMap = new EnumMap<OrderStatus, Integer>(OrderStatus.class);
        enumMap.put(OrderStatus.DELIVERED, 3);
        enumMap.put(OrderStatus.SHIPPED, 1);
        enumMap.forEach((key, value) -> System.out.println(key + " " + value));

        //EnumSet
        EnumSet<OrderStatus> enumSet = EnumSet.allOf(OrderStatus.class);
        enumSet.forEach(System.out::println);
    }



}
