// program to take input from keyboard 
// java provide class "Scanner" that is used the data from different sources 
// Scanner class is present in java.util package provided from version 5
// method of scanner : nextInt()
// nextFloat()
// nextDouble()
// next() - to read string
// nextLine() - to read sentence
// nextByte()
// nextShort()
// nextLong()
// nextBoolean()

// hasNextInt() - true or false (if input is integer true else false ddddd)
// hasNextFloat()

import java.util.*;

public class heelo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // used by createing objext , Scanner{class name} s{refrence} = new
        // Scanner{constructor}(System.in){System.in is accociated with keryboard}
 
        int a,b,c;
        System.out.println("enter two number ");

        a = s.nextInt();
        b = s.nextInt();

        c= a + b ;
        System.out.println("sum of two number is  " + c);


    }

}
