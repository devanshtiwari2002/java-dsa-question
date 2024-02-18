import java.lang.*; // lang is a package 

class MyFirst { // class name should be same as file name
   public static void main(String arg[]) { // main method
      // main method should not return anything so void ,
      // jvm should be able to see the main method so make public
      // be can not use class unless we have cleared object , but if we want to create
      // a class without object then it should be decleraed static
      {
         System.out.println("Hello world");
      }
   }
}

// MyFirst.class is a file after compile (byte coded)
// jvm will call MyFirst.main()