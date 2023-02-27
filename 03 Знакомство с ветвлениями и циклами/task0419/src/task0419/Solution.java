package task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int []a = {sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt()};
        num(a);
    }

    public static void num (int[] a){
        for (int j=0;j< a.length;j++){
            for (int i = j+1; i< a.length;i++){
                if (a[j] > a[i]) {
                    int x = a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
        }
        System.out.println(a[a.length-1]);
    }
}
