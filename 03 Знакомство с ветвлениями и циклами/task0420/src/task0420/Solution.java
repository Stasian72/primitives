package task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[]x = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        num(x);
        //напишите тут ваш код

    }

    public static void num (int[]a){



        for (int j = a.length-1;j>=0;j--){
            for (int i = j-1;i>=0;i--){
                if (a[j]>a[i]){
                    int x = a[j];
                    a[j]=a[i];
                    a[i]=x;
                }

            }
        }
        for (int b:a) {
            System.out.print(b + " ");

        }
    }
}
