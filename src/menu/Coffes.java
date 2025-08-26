package menu;

/**
 * Включение абстрактного класса в дочерний класс Coffes
 * Добавление @Override для методов
 *
 */

import java.math.BigDecimal;

public class Coffes extends MenuItem {
    private String typ;

    public Coffes(String typ, String id, String name, BigDecimal price) {
        super(id,name,price);
        this.typ= typ;
    }
    public String getTyp() {return typ;}

    public void setTyp(String newTyp) {typ = newTyp;}

}
