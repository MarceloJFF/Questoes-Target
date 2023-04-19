package com.target.Pergunta5;


/* 
5) Escreva um programa que inverta os caracteres de um string.
*/
public class app {
    public static void main(String[] args) {
        String texto = "Target é uma ótima empresa";
        String textoInvertido = "";
        //percorre a string de trás pra frente adicionando os valores a String texto invertido
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        System.out.println("Texto: "+ texto);
        System.out.println("Texto invertido: " + textoInvertido);      
    }
}
