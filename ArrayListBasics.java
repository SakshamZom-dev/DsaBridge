// An ArrayList is a part of the Java Collections Framework that provides a dynamically resizable array.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList<Integer> list =  new ArrayList<>();
        // list.add(12);
        // list.add(13);
        // list.add(14);
        // list.add(24);
        // System.out.println(list);

        // System.out.println("Contains 24? \t" + list.contains(24));
        // System.out.println("Contains 11? \t" + list.contains(11));

        // list.set(0, 67);
        // System.out.println(list);

        // list.remove(2);
        // System.out.println(list);

        // ArrayList<Integer> list2 =  new ArrayList<>();
        // System.out.println();
        // System.out.print("Write the values for 5 values in the list:\t");
        // for (int i = 0; i < 5 ; i++) {
        //     list2.add(sc.nextInt());
        // }

        // System.out.println(list2);

        // System.out.println();
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(list2.get(i)+ " ");
        // }

        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();

        for (int i = 0; i < 3 ; i++) {
            newList.add(new ArrayList<>());
        }

        System.out.println();
        System.out.print("Write all the 9 elements: \t");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newList.get(i).add(sc.nextInt());
            }
        }
        System.out.println(newList);

        sc.close();
    }
}