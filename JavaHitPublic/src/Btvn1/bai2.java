
package bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n:");
        float n = sc.nextFloat();
        
        if( n < 0){
            System.out.println("nhap lai n");
        }
        else{
            float Sum = 0;
        for(int i = 1; i <= n; i++)
        {
            Sum += (float)1/i;
        }
        System.out.println(Sum);
        }
    }
}
