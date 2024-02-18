import java.lang.*; // lang is a package 

class MyFirst { 
   public static void main(String arg[]) { 
         System.out.println("Hello world");
      }
   }


// Explanation:
// - The class name should match the file name or compile using the file name and run using the class name.
// - The main method is the starting point of execution for the Java program.
// - It should be declared as public so that JVM can access it.
// - It should be declared as static so that JVM can call it without creating an instance of the class.
// - It should not return anything, hence the return type is void.
// - The parameter String[] args is used for command-line arguments.
// - The System.out.println() method is used to print the message "Hello world" to the console.
// - The import statement is unnecessary here as classes from the java.lang package are automatically imported by Java.
// - The class file generated after compilation is MyFirst.class.
// - During execution, the JVM will call the main method to start the program.
