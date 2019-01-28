package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        for (int i = 0; i <=10 ; i++) {
            list1.add("num_"+i);
            list2.add("num_"+i);
        }

        printElements(list1);
        System.out.println("-----------");
        printElements(list2);
        System.out.println("-----------");

//        for (ListIterator<String> iterator = list2.listIterator(); iterator.hasNext(); ) {
//            iterator.next();
//            iterator.???
//        }
        for (int i = list2.size() - 1; i >= 0; i--) {
            String s = list2.get(i);
            list1.add(s);
        }

        printElements(list1);
    }

    private static void printElements(List<String> list1) {
        for (Iterator<String> iterator = list1.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
