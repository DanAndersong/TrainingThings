package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg = new Zerg();
        zerg.name = "Zerg";
        Zerg zero = new Zerg();
        zero.name = "Zero";
        Zerg zeri = new Zerg();
        zeri.name = "Zeri";
        Zerg zerk = new Zerg();
        zerk.name = "Zerk";
        Zerg zerq = new Zerg();
        zerq.name = "Zerq";

        Protoss protoss = new Protoss();
        protoss.name = "Protoss";
        Protoss proto = new Protoss();
        proto.name = "Proto";
        Protoss prot = new Protoss();
        prot.name = "Prot";

        Terran terran = new Terran();
        terran.name = "Terran";
        Terran terra = new Terran();
        terra.name = "Terra";
        Terran terr = new Terran();
        terr.name = "Terr";
        Terran te = new Terran();
        te.name = "Te";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
