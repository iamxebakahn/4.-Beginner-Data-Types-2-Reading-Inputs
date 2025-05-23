// Problem Description

// You'll write some code to help you cook a gorgeous lasagna from your favorite cookbook. Now, you also want to add a few layers to the lasagna. Assume **each layer takes 2 minutes** to prepare. Given the number of layers you want to add to the lasagna, find how many minutes you would spend making them.


// Input Format

// The only first line contains the integer N denoting the number of layers.


// Output Format

// Print in a single line how many minutes are required to prepare N layers.


// Example Input

// Input:-
// 2


// Example Output

// Output:-
// 4
import java.lang.*;
import java.util.*;

public class Q3AP_Beginner_Data_Types_2_Reading_Inputs{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print(2*N);
        }
}