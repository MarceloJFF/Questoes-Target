package com.target.Pergunta2;
/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o 
próximo valor sempre será a soma dos 2 
valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, 
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando 
se o número informado pertence ou não a sequência.*/

public class Questão2 {
    public static void main(String[] args) {
        Integer value = 5;
        if(isOnFibonacci(value)){
            System.out.println("Pertence a sequencia de Fibonacci");
        }else{
            System.out.println("Nao pertence a sequencia de Fibonacci");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static boolean isOnFibonacci(Integer value){
        Integer counter = 0;
        
        while (fibonacci(counter) < value) {
            counter++;
        }
        return fibonacci(counter) == value;
    }
    
}
