package org.toyshop;

import java.util.ArrayList;
import java.util.List;

public class Goods {
    List<Toy> goods;

    public Goods(List<Toy> goods) {
        this.goods = goods;
    }

    public Goods() {
        this(new ArrayList<>());
    }

    /**
     *
     * @param toy игрушка, которую нужно добавить в список товаров (класс Toy)
     */
    public void addToy(Toy toy) {
        goods.add(toy);
    }

    /**
     *
     * @return возвращает весь список товаров
     */
    public String getGoods() {
        StringBuilder sb = new StringBuilder();
        for (Toy i : goods) {
            sb.append(i.getToyInfo());
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     *
     * @param id ИД товара, который нужно найти
     * @return возвращает товар в соответствии с указанным ИД
     */
    public Toy getToyById(int id) {
        Toy toy = new Toy();
        for (Toy i : goods) {
            if (i.getId() == id) {
                toy = i;
            }
        }
        return toy;
    }

}
