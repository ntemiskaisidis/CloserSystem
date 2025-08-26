package menu;

import java.math.BigDecimal;

public class NonAlko extends  MenuItem {
    private String typ;
    public NonAlko (String typ, String id, String name, BigDecimal price) {
        super(id,name,price);
        this.typ= typ;

    }
    public String getTyp () {return typ;
    }
    public void setTyp(String newTyp){typ = newTyp;}



}
