package item01;

import java.util.EnumSet;

import static item01.Foo.Color.RED;
import static item01.Foo.Color.WHITE;
import static item01.Foo.Color.BLUE;

public class Foo {

    String name;
    String address;

    public Foo(String name) {
        this.name = name;
    }

    private static final Foo GOOD_NIGHT = new Foo();

    public Foo() {

    }

    public static Foo withName(String name) {
        return new Foo(name);
    }

//    public Foo(String address) {
//        this.address = address;
//    }

    public static Foo withAddress(String address) {
        Foo foo = new Foo();
        foo.address = address;
        return foo;
    }

    public static Foo getFoo() {
        return GOOD_NIGHT;
    }

    public static Foo getFoo(boolean flag) {
        Foo foo = new Foo();
        // TODO 어떤 특정 약속 되어 있는 텍스트 파일에서 Foo 구현체의 FQCN. full qulityfy class name
        // TODO FQCN에 해당하는 인스턴스를 생성한다.
        // TODO foo 변수를 해당 인스턴스를 가리키도록 수정한다.
        return foo;
    }


    public static void main(String[] args) {
        Foo foo = new Foo("keesun");
        Foo foo1 = Foo.withName("keesum");

        Foo foo2 = Foo.getFoo();
        Foo foo3 = Foo.getFoo(false);
        EnumSet<Color> colors = EnumSet.allOf(Color.class);
        EnumSet<Color> blueAndWhite =  EnumSet.of(RED, WHITE);
    }


    enum Color {
        RED, BLUE, WHITE
    }


    //private static method가 필요한 이유.
    public static void doSometing() {
        // TODO 청소를 한다.
        // TODO 애들이랑 놀아준다.
        // TODO 저녁 약속에 간다.
        게임을하고잔다();

    }

    public static void doSomethingTomorrow() {
        // TODO 게임을 한다.
        // TODO 잔다.
        게임을하고잔다();
    }

    private static void 게임을하고잔다() {
        // TODO 게임을한다.
        // TODO 잔다
    }

}

//장점1: 이름을 가질 수 있다.
//생성자에 제공하는 파라메터가 거기서 반환하는 객채들을 잘 설명하지 못할 경우, 잘 만든 이름을 가진 static 팩토리르 사용하는 것이 보다
//더 쉽고 (해당 팩토리 메소드의 클라이언트 코드를) 읽기 편하다. 그 예로 BigInteger.probblePrime을 듣고 있다.
//
//또, 생성자는 시그니처에 제약이 있다. 똑같은 타입을 파라미터로 받는 생성자 두개를 만들 수 없으니까 그런 경우에도 public static 팩토리
//메소드를 사용하는 것이 유용하다.


//장점2: 반드시 새로운 객체를 만들 필요가 없다.
//불변(immulate) 클래스 (아이템17)인 경우나 매번 새로운 객체를 만들 필요가 없는 경우에 미리 만들어둔 인스턴스 또는 캐시해둔 인스턴스를
//반환할 수 있다.
//
//장점3: 리턴타입의 하위 타입 인스턴스를 만들 수도 있다.
//클래스에서 만들어 줄 객체의 클래스를 선택하는 유연함이 있다. 리턴 타입의 하위 타입이

