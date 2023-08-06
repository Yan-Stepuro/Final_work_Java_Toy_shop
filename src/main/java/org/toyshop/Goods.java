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

    public void addToy(Toy toy) {
        goods.add(toy);

//        System.out.println("Изначальный список _ " + getGoodsInfo());
//        System.out.println("Список пустой? _ " + goods.isEmpty());

//        if (goods.isEmpty()) {
//            System.out.println("Добавляем первую запись" + toy.getToyInfo() + "\n");
//            goods.add(toy);
//        } else {
//            for (Toy i : goods) {
//                System.out.println("берем элемент _ " + i.getName());
//                if (i.getName().equals(toy.getName())) {
//                    flag = false;
//                    System.out.println("сравниваем с _ " + toy.getName());
//                    System.out.println("Результат сравнения _ " + !i.getName().equals(toy.getName()));
//                    System.out.println("Добавляем _ " + toy.getToyInfo());
//                    goods.add(toy);
//                    System.out.println("Получаем _ " + getGoodsInfo());
//                } else {
//                    System.out.println("Товар с таким именем уже существует.");
//                }
//            }
//
//            boolean flag = true;
//            while (flag) {
//                for (Toy i : goods) {
//                    System.out.println("берем элемент _ " + i.getName());
//                    System.out.println("сравниваем с _ " + toy.getName());
//                    System.out.println("Результат сравнения _ " + i.getName().equals(toy.getName()));
//                    if (i.getName().equals(toy.getName())) {
//                        flag = false;
//                        System.out.println("Товар с таким именем уже существует.");
//                    } else {
//                        System.out.println("Добавляем _ " + toy.getToyInfo());
//                        goods.add(toy);
//                        System.out.println("Получаем _ " + getGoodsInfo());
//                        flag = false;
//                    }
//                }
//            }
//        }
    }

    public String getGoods() {
        StringBuilder sb = new StringBuilder();
        for (Toy i : goods) {
            sb.append(i.getToyInfo());
            sb.append("\n");
        }
        return sb.toString();
    }

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
