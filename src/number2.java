package src;

import java.util.Scanner;
public class number2 {
    // 2)
    

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuário que insira um número
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        if (pertenceSequenciaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
    public static boolean pertenceSequenciaFibonacci(int numero) {
        int a = 0;
        int b = 1;
        
        while (b <= numero) {
            if (b == numero) {
                return true;
            }
            
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return false;
    }
}

    
}
