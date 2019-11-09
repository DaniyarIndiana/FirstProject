package Loops;

import java.util.Scanner;

public class TriangleTaskLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int size = 0;
        char c = '*';
        System.out.println("Enter height of the triangle : ");
        size = sc.nextInt();
        System.out.println("Which character you want to use : ");
        c = sc.next().charAt(0);*/
        int i, j, k;
        char c = '*';
        for (i = 1; i < 7; i++) {
            for (j=c; j > i; j--) {
                System.out.print("^");
            }
            for (k = 0; k < (2 * i - 1); k++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    }

