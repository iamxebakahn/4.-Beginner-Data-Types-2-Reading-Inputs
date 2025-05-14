// Problem Description

// Your younger brother is going to a modern school. In his school, there was a coding competition planned. The pannel asked a question "Write a program which can perform the task - Add two numbers and divide them by a third number and print the remainder".
// You are a programmer and your brother asks you to write a code that helps him to check his approach.


// Problem Constraints

// 0 <= N1, N2 <= 10000000
// 1 <= N3 <= 10000000


// Input Format

// First line is number N1.

// Second line is number N2.

// Third line is number N3.



// Output Format

// Print the value of remainder.


// Example Input

// Input 1 :

// 14

// 63

// 12

// Input 2 :

// 53

// 29

// 23



// Example Output

// Output 1 :

// 5

// Output 2 :

// 13
import java.lang.*;
import java.util.*;

public class Q2AP_Beginner_Introduction_to_beginner_module.java{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for(int i=1;i<=5;i++)
        {
            if((i==1)||(i==5))
            {
                 for(int j=1;j<=6;j++)
                    {
                         System.out.print("*");
                    }
            }

            else
            {
                for(int j=1;j<=6;j++)
                    {
                        if((j==1)||(j==6))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

            }

            System.out.println();
            
        }
    }
}
