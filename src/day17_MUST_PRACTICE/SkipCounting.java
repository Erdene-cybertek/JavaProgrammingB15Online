package day17_MUST_PRACTICE;

public class SkipCounting {

    public static void main(String[] args) {

        // Skip counting by 3 from 0 till 30
        // 3 6 9 12 15 18 21 24 27 30

        int x = 0;
        while (x < 30) {
            x += 3;
            System.out.print(x + " ");
        }  { System.out.println(); }

// write a program to print out a even number from 0 to 50;

        int y = 0;
        while (y < 50) {
            y += 2;
            System.out.print(y + " ");
        } { System.out.println(); }

// write a program to print out a even number from 0 to 50;

        int z = 1;
        while (z <= 50) {
            System.out.print(z + " ");
            z +=2;
        } { System.out.println(); }

// using if statement, find even and odd numbers
        int t = 0;
        while (t <= 50) {
            if (t % 2 == 0) {
                System.out.println(t + " is even number");
            } else {
                System.out.println(t + " is odd number");
            }
            t ++;
        }
    }
}