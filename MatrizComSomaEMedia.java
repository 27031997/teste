package matrizcomsomaemedia;

import java.util.Scanner;

public class MatrizComSomaEMedia {

    public static void main(String[] args) {
        System.out.println("Programa de Matriz (20 números, com soma e média aritmética");
        
        int num[]= new int [20];
        Scanner scan = new Scanner (System.in);
        
        for (int lista=0; lista<20; lista++ ){
            System.out.print("Insira um número " + (lista+1) + ": ");
            num[lista] = scan.nextInt();
        }
        System.out.println();
        System.out.println("Listando...");
       
        int soma = 0;
        int media = 0;
        
            for (int listando=0; listando<num.length; listando++){
                soma += num[listando];
                media = listando +1;
                float total = (float)soma/media;
                
                System.out.println("Número     Soma     Média");
                System.out.println(num[listando] +"          "+ soma +"        "+total);
            }
    }  
}

    
    

