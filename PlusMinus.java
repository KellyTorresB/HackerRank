import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.List;
class Result {
public static void plusMinus(List<Integer> arr) {
int positiveCount = 0;
int negativeCount = 0;
int zeroCount = 0;
int size = arr.size();
for (int num : arr) {
if (num > 0) {
positiveCount++;
} else if (num < 0) {
negativeCount++;
} else {
zeroCount++;
}
}
double positiveRatio = (double) positiveCount / size;
double negativeRatio = (double) negativeCount / size;
double zeroRatio = (double) zeroCount / size;
System.out.printf("%.6f%n", positiveRatio);
System.out.printf("%.6f%n", negativeRatio);
System.out.printf("%.6f%n", zeroRatio);
}
}
public class Solution {
public static void main(String[] args) {
// Read input from standard input
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
List<Integer> arr = new ArrayList<>();
for (int i = 0; i < n; i++) {
arr.add(scanner.nextInt());
}
// Call plusMinus function
Result.plusMinus(arr);
scanner.close();
}
}
