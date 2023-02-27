package task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int []a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        num(a);

    }

    public static void num (int[] a){
        for (int j=0;j< a.length; j++){
            for (int i=j+1;i< a.length; i++){
                if (a[j]==a[i]){
                    System.out.println(a[j] + " "+ a[i]);
                }
//                System.out.print(a[j]==a[i]?a[j] + " "+ a[i]:"");
            }

        }

    }
}
