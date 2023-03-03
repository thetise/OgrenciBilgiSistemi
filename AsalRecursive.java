package Giris;

import java.util.Scanner;
public class AsalRecursive {

    static int asal(int a){

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }

        if(count == 2){
            System.out.print(number);
            System.out.println(" sayısı ASALDIR !");
        }
        else{
            System.out.print(number);
            System.out.println(" sayısı ASAL değildir !");
        }
        return asal(number);
    }
    public static void main(String[] args) {

        System.out.println(asal(10));

    }
}
