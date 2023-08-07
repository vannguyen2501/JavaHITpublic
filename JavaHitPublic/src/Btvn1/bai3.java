
package Btvn1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap so nguyen duong n");
        int n = sc.nextInt();
        boolean k = true;
        for(int i = 2; i < sqrt(n); i++)
        {
            if( n % i == 0)
            {
                k = false;
                break;
            } 
        }
        if(k == true)
        {
            System.out.println(n+"la so nguyen to");
        }
        else
        {
            System.out.println(n+"khong la so nguyen to");
        }
    }
}
