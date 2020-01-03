package com.javarush.task.task14.task1411;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> values = Arrays.asList("user", "proger", "coder", "loser");

        boolean inCircle = true;
        while (inCircle){
            key = reader.readLine();
            if (values.contains(key)){
            switch (key) {
                case "user": person = new Person.User(); break;
                case "loser": person = new Person.Loser();break;
                case "coder": person = new Person.Coder();break;
                case "proger": person = new Person.Proger();break;
                default:return;
            } } else break;
            doWork(person); //вызываем doWork
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) ((Person.User) person).live();
        if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
