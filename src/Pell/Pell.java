package Pell;

import java.util.Scanner;

public class Pell {
    public static long pellNumber(int n) {

            long c=0, p=1,cn;
            for (int i=1; i<=n; i++)
            {
                cn=p+2*c;
                p=c;
                c=cn;
            }
            return c;
        }
        public static void main(String[] args){

            System.out.println("Введите число");

            Scanner inp = new Scanner(System.in);
            int n = inp.nextInt();

            System.out.println("Число Пелля = " + pellNumber(n));
        }
    }

