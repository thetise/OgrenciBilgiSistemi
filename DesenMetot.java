package Giris;

import java.util.Scanner;
public class DesenMetot {

    static void desen(int n, int count, boolean ok){

        if(n <= 0){
            ok = false;
        }
        if(n > 0 && ok == true){
            System.out.print(n+" ");
            desen(n - 5, ++count, ok);
        }
        else{
            System.out.print(n+" ");
            if(count == 0){
                return;
            }
            desen(n + 5, --count, ok);
        }
    }

    static void desen (int n){
        desen(n, 0,true);
    }

    public static void main(String[] args) {

        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");

        a = input.nextInt();

        desen(a);
    }
}
