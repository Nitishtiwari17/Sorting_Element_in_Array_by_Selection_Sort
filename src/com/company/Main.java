package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n, loc, a[], temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the element do u want to enter:");
        n = sc.nextInt();
        a = new int[n];
        System.out.print("enter element:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            loc = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[loc])
                {
                    loc=j;
                }
            }
            temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("sorted element are:"+a[i]);
        }
    }
}
