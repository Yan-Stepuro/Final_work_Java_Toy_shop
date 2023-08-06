package org.toyshop;

import java.util.*;

public class Draw{
    PriorityQueue<Toy> drawList;

    public Draw() {
        this.drawList = new PriorityQueue<>();
    }

    public String getDrawList() {
        StringBuilder sb = new StringBuilder();
        for (Toy i : drawList) {
            sb.append(i.getToyInfo());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addToDrawList(Goods goods) {
        System.out.print("Введите id товара, который необходимо добавить в список разыгрываемых: ");
        int inputId = inputValue();
        boolean flag = true;
        int dropChanceSum = 0;
        int drawStock = 0;

        while (flag) {
            if (checkUnique(inputId)) {
                for (Toy j : goods.goods) {

                    if (inputId == j.getId()) {
                        System.out.print("Введите шанс выпадения (доля от 1 до 10): ");
                        int dropChance = inputValue();
                        j.setDropChance(dropChance);
                        dropChanceSum += dropChance;

                        System.out.print("Введите количество игрушек, которые участуют в розыгрыше: ");
                        drawStock = inputValue();
                        j.setStock(drawStock);
                        drawList.add(j);
                    }
                    flag = false;
                }
            } else {
                System.out.println("Товары должны быть уникальными.");
                flag = false;
            }
        }
    }

    private int inputValue() {
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    private boolean checkUnique(int inputId) {
        for (Toy i : drawList) {
            if (drawList.element().getId() == inputId) {
                return false;
            }
        }
        return true;
    }

    public Toy getWinner() {
        ArrayList<Integer> rollArray = createRollArray();
        Toy winner = new Toy();

        Random rnd = new Random();
        int winnerIndex = rnd.nextInt(rollArray.size());
        int winnerId = rollArray.get(winnerIndex);

        for (Toy o : drawList) {
            if (o.getId() == winnerId) {
                winner = o;
            }
        }
        winner.setStock(winner.getStock() - 1);
//        drawList.remove(winner);
        return winner;
    }

    private ArrayList<Integer> createRollArray() {
        ArrayList<Integer> rollArray = new ArrayList<>();
        for (Toy o : drawList) {
            for (int i = 0; i < o.getDropChance(); i++) {
                rollArray.add(o.getId());
            }
        }
        return rollArray;
    }
}
