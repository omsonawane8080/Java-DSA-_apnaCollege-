package Lecture9;

import java.util.Scanner;


public class Arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      String names[] = new String[size];


      //input
      for(int i=0; i<size; i++) {
          names[i] = sc.next();
      }
     
      //output
       for(int i=0; i<names.length; i++) {
           System.out.println("name " + (i+1) +" is : " + names[i]);
       }
      
   }
}
//output
//name 1 is : John
//name 2 is : Peter
//name 3 is : David
//name 4 is : James
//name 5 is : Robert
//name 6 is : William
//name 7 is : Richard
//name 8 is : Charles
//name 9 is : Thomas
//name 10 is : Donald
//name 11 is : Ronald
//name 12 is : Harold
