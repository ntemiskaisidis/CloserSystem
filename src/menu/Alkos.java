package menu;

import java.math.BigDecimal;

public class Alkos extends MenuItem {
    String ml;
    public Alkos (String ml, String id, String name, BigDecimal price) {
        super(id,name,price);
        this.ml = ml;

    }

}
