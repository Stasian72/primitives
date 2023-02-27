package task0314;

/* 
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...


Requirements:
1. Программа должна выводить текст.
2. Выведенный текст должен содержать 10 строк.
3. Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
4. Выведенные числа должны быть таблицей умножения.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] x = new int[10];
//

        tabl(x);

    }

    public static void tabl(int[] a) {
        int count = 1;
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                if (i == 0) {
                    a[i] = count;
                } else {
                    a[i] = a[i - 1] + count;
                }
                System.out.print(a[i] + " ");
            }
            count++;
            System.out.println();
        }

    }
}
