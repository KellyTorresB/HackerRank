import java.io.*;
import java.util.*;
public class Solution {
public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class
should be named Solution. */
Scanner scanner = new Scanner(System.in);
int q = scanner.nextInt(); // Number of queries
for (int i = 0; i < q; i++) {
int a = scanner.nextInt();
int b = scanner.nextInt();
int n = scanner.nextInt();
int term = a;
for (int j = 0; j < n; j++) {
term += Math.pow(2, j) * b;
System.out.print(term + " ");
}
System.out.println();
}
scanner.close();
}
}
