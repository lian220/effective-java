package act1.item02;

import java.util.EnumSet;
import java.util.Objects;

public abstract class Pizza {
    public enum Topping {
        HAM, MUSHROOM, ONION, PEEPER, SAUSAGE
    }

    final EnumSet<Topping> toppings;

    //자기자신의 하위 타입을 받는 매게변수 재귀 {
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build(); //'Convarinat 리턴 타입'을 위한 준비작업

        protected abstract T self(); // 'self - type'
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings;
    }
}
