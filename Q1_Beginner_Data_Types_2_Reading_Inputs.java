// Problem Description

// You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook. According to your cookbook, the Lasagna should be in the oven for 40 minutes. Given the time (in minutes), the lasagna has been in the oven, find how many more minutes the lasagna still needs to bake for.


// Problem Constraints

// 0 <= N <= 40


// Input Format

// The only first line contains the integer N, denoting the actual time (in minutes) the lasagna has been in the oven for.


// Output Format

// Print in a single line how many minutes the lasagna needs to bake.


// Example Input

// Input: 
// 30


// Example Output

// Output: 
// 10
import java.lang.*;
import java.util.*;

public class Q1_Beginner_Data_Types_2_Reading_Inputs{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int time= sc.nextInt();
        System.out.print(40-time);
    }
}   
