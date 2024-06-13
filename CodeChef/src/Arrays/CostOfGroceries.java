package Arrays;

import java.util.Scanner;

public class CostOfGroceries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }

            // Your code goes here
            int totalCost = 0;
            for (int i = 0; i < a.length; i++) {
                if(a[i] >= x){
                    totalCost+= b[i];
                }
            }
            System.out.println(totalCost);
        }
/*
* 2
2
5
1 2
1 3
2
3
5
1 2
1 3
* */





    }

}
