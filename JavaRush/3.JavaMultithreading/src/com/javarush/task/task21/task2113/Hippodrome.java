package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome (List<Horse> horses) {
        this.horses = horses;

    }
    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("1", 3, 0));
        horses.add(new Horse("2", 3, 0));
        horses.add(new Horse("3", 3, 0));

        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses () {
        return horses;
    }

    public void run() throws InterruptedException {

        for (int i = 0; i < 50; i++) {
            Thread.sleep(200);
            move();
            print();
        }
    }

    public void move() {
        horses.forEach(Horse::move);
    }

    public void print() {
        horses.forEach(Horse::print);
    }

    public Horse getWinner() {
        int winner = 0;

        for (int i = 0; i < horses.size()-1; i++) {
            if (horses.get(i).getDistance() > horses.get(i+1).getDistance()) {
                winner = i;
            }else {
                winner = i+1;
            }
        }
        return horses.get(winner);
    }

    public void printWinner() {
        System.out.printf("Winner is %s!%n",getWinner().getName());
    }
}
