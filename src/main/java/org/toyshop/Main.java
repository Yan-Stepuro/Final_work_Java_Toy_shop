package org.toyshop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Goods toys = new Goods();
        Toy newToy = new Toy();
        toys.addToy(new Toy(1,"машина", 10));
        toys.addToy(new Toy(2,"медведь", 10));
        toys.addToy(new Toy(3,"паровозик", 10));
        toys.addToy(new Toy(4,"футбольный мяч", 10));
        toys.addToy(new Toy(5,"СКАЛАПЕНДРА", 10));

        toys.addToy(newToy.createToy(toys));

        System.out.println("Cписок товаров: \n" + toys.getGoods());

        Draw draw = new Draw();
        Logger log = new Logger();

        while (checkInput()) {
            draw.addToDrawList(toys);
        }

        System.out.println("Товары, участвующие в розыгрыше: \n" + draw.getDrawList());
        log.pushLog("Товары, участвующие в розыгрыше: \n" + draw.getDrawList());

        System.out.println("ПОБЕДИТЕЛЬ: " + draw.getWinner().getToyInfo());
        log.pushLog("ПОБЕДИТЕЛЬ: " + draw.getWinner().getToyInfo());

        log.save();
    }

    public static boolean checkInput() {
        System.out.println("Добавить товары к розыгрышу? (Y - да, N - нет)");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
}