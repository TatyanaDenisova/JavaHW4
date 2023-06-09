package org.example;

import java.util.LinkedList;
import java.util.Random;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//        Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый
//        элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
//
public class Main {
     static LinkedList<Integer> list = new LinkedList<>();
     static LinkedList<Integer> newList = new LinkedList<>();

    public static void main(String[] args) {
        list = createList(7);
        System.out.println("Перевернутый список: "+reverseList(list));

        enqueue(list,22);
        System.out.println("Первый элемент из списка, который будет удален "+dequeue(list));
        System.out.println("Список без первого элемента "+list);
        System.out.println("Первый элемент из списка "+first(list));
    }
    private static LinkedList<Integer> reverseList(LinkedList<Integer> list){

        for (int i = list.size()-1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }
    private static LinkedList<Integer> createList(int size){

        Random random = new Random();
        for (int i = 0; i < size ; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);
        return list;
    }
    private static void enqueue(LinkedList<Integer> list, int num){
        list.addLast(num);
        System.out.println("Добавление элемента в конец очереди "+list);
    }
    private static int dequeue(LinkedList<Integer> list){
           int num = list.getFirst();
           list.remove(0);
           return num;
    }
    private static int first(LinkedList<Integer> list){
        int num = list.get(0);
        return num;
    }
}