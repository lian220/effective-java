package item03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

public class SingleTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton1 stingleton1 = Singleton1.instance;

        Constructor<Singleton1> constructor = Singleton1.class.getConstructor();
        constructor.setAccessible(true);
        Singleton1 singleton12 = constructor.newInstance();

        Singleton2 singleton2 = Singleton2.getInstance();
        Supplier<Singleton2> s2supplier = Singleton2::getInstance;

        // enum은 상속이 안된다.
        Singleton3 singleton3 = Singleton3.INSTANCE;

        //스프링 을 쓴다면 스프링에 빈을 등록하여 사용하자
    }
}
