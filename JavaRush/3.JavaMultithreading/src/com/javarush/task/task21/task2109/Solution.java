package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        @Override
        protected B clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected C clone() {
            return new C(this.getI(),this.getJ(),this.getName());
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        C c = new C(1,1,"Name");
        C clone = c.clone();

        B b = new B(1,1,"Name");

        B cloneb = b.clone();

        System.out.println(b);
        System.out.println(cloneb);
    }
}
