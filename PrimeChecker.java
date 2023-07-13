import java.io.*;
import java.util.*;
public class Solution {
public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class
should be named Solution. */
Scanner scanner = new Scanner(System.in);
String st = " ";
int j = 0;
for (int i=1; i<=5;i++) {
int number = scanner.nextInt();
if (Prime.checkPrime(number)) {
j++;
if(j==1){
st=number + " ";
}else{
st+=number + " ";
}
}
if (i==4)continue;
else System.out.println(st);
}
scanner.close();
}
}
class Prime{
static boolean checkPrime(int number) {
int remainder0 =0;
if (number==1) return false;
else if (number==2 || number==3) return true;
else {
for (int j=2; j<=number/2; j++) {
if (number%j==0) remainder0++;
}
if (remainder0>0) return false;
else return true;
}
}
}
