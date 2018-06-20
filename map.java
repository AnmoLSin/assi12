package javaapplication4;

import java.util.*;
public class map{
  public static void main(String args[]) {
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
  Scanner s=new Scanner(System.in);
      System.out.println("Enter elements : ");
  for(int i=0;i<5;i++)
  {
      String a=s.nextLine();
      hash_map.put(i,a);
  }
      System.out.println("Hashmap => ");
  for(Map.Entry b:hash_map.entrySet())
  {
   System.out.println(b.getKey()+"--->"+b.getValue());
  }
 }
}