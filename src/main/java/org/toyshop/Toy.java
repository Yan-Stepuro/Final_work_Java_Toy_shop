package org.toyshop;

import java.util.Scanner;

public class Toy implements Comparable<Toy>{
    int id = 0;
    String name;
    int stock;
    int dropChance;

    public Toy(int id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public Toy(int id, String name, int stock, int dropChance) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.dropChance = dropChance;
    }

    public Toy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDropChance() {
        return dropChance;
    }

    public void setDropChance(int dropChance) {
        this.dropChance = dropChance;
    }

    public Toy createToy() {
        Scanner sc = new Scanner(System.in);
        id = this.id + 1;
        System.out.print("Введите наименование товара: ");
        name = sc.nextLine();
        System.out.print("Введите количество товара: ");
        stock = Integer.parseInt(sc.nextLine());
        return new Toy(id, name, stock);
    }

    public String getToyInfo() {
        Integer temp = dropChance;
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(", ");
        sb.append("Наименование: ");
        sb.append(name);
        sb.append(", ");
        sb.append("Количество: ");
        sb.append(stock);

        if(temp != 0) {
            sb.append(", ");
            sb.append("Шанс выпадения: ");
            sb.append(temp);
        }

        return sb.toString();
    }

    @Override
    public int compareTo(Toy o) {
        if (this.dropChance > o.dropChance) {
            return -1;
        } else if (this.dropChance < o.dropChance) {
            return 1;
        } else {
            return 0;
        }
    }
}
