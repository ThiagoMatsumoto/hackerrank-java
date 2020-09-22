import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        // Write your code here.
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();              //obs1
        String s = scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

//obs1: Java Scanner entende aonde o primeiro digito de double ou int começa. Para esses tipos, 
o espaço não é considerado como um input válido então ele olha para o próximo input. 
Mas para String é diferente pois um simples enter ou espaço é válido para uma String. Então
precisamos limpar o buffer enquanto pegamos o input para uma String.

//Keyboard Buffer (espaço da memória RAM que armazena o que for digitado 
pelo teclado antes de ser executado pela CPU)

