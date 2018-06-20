package javaapplication4;

import java.util.*;
import java.util.Scanner;
  public class sets {
  public static void main(String[] args) {
        HashSet h1 = new HashSet();
        HashSet h2 = new HashSet();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements for Hashset 1:  ");
        for(int i=0;i<5;i++)
        {
            int n=s.nextInt();
             h1.add(n);
        }
        System.out.println("Enter elements for Hashset 2:  ");
        for(int i=0;i<5;i++)
        {
             int n=s.nextInt();
             h2.add(n);
        }
          System.out.println("First Hashset: "+h1);
          System.out.println("Second Hashset: "+h2);
          h1.retainAll(h2);
          System.out.println("Hashet:"+h1);
     }
}