package item03;

import java.io.Serializable;

public enum Singleton3 implements Serializable{

    INSTANCE;

    public String getName() {
        return "keesun";
    }

}
