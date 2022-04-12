package ulanganharian;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int bil;
    int total=0;
    
    System.out.print("Masukkan Bilangan : ");
    bil = input.nextInt();
    
    for(int i=1; i <= bil; i++){
        int j = i + 1;
        total += i;
        System.out.print(i+" + ");
    }
    
        System.out.println("= " +total);
}
}
