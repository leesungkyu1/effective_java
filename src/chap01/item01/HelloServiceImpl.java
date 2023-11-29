package chap01.item01;

import java.util.ArrayList;
import java.util.List;

public class HelloServiceImpl implements HelloService{
    @Override
    public String hello() {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        saltInt(arr);
        return null;
    }

    public static void main(String[] args) {
        HelloServiceImpl helloService = new HelloServiceImpl();
        helloService.hello();
    }
}
