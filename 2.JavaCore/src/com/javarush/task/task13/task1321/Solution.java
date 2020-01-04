package com.javarush.task.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(Dream.HOBBY.INDEX); //new Hobby()
    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}