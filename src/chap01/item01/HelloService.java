package chap01.item01;

import java.util.List;

public interface HelloService {

    String hello();

    //private 필드가 필요한 경우 추상클래스나 final 클래스가 필요할 수 있음

    static String hi(){
        return "hi";
    }

    //instance method 생성 : default 추가해야함
    default String bye(){
        return "bye";
    }
}
