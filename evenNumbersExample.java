// Programming Lab Assignment 2
// (20 points)
// Instructions: Please submit the .java file on iCollege at the end of the class.
// 1. Write a program with name of evenNumbersExample with a method called evenNumbers that
// accepts a Scanner reading input from a file with a name of numbers.txt, with a series of integers,
// and report various statistics about the integers to the console. Report the total number of
// numbers, the sum of the numbers and the count of even numbers. For example, if the input file
// contains the following text:
//  5 7 2 8 9 10 12 98 7 14 20 22
// Then calling the method should produce the following console output:
//  12 numbers, sum = 214
//  8 evens 

/*
1. DONE  rename the class and file " EvenNumbersExample" 
2. DONE write a method called evenNumbers
3. DONE parameter of Scanner 
4. DONE reading input from a file with a name of numbers.txt
5. DONE read series of integers " 5 7 2 8 9 10 12 98 7 14 20 22 "
6. DONE report he total number of numbers
7. DONE report the sum of the numbers
8. DONE report the count of even numbers
9. DONE Output should look like this 
  12 numbers, sum = 214
8 evens 
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class evenNumbersExample {

    public static void evenNumbers(Scanner sc1) {
        int sum = 0;
        int count = 0;
        int even = 0;
        while (sc1.hasNextInt()) {
            int num = sc1.nextInt();
            //System.out.println(num);
            count = count + 1;
            sum = sum + num;
            if (num % 2 == 0) {
                even = even + 1;
            }
        }
        System.out.println(count + " numbers, sum = " + sum);
        System.out.println(even + " evens");

    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("numbers.txt"));
        evenNumbers(sc);
    }

}
