package com.target.Pergunta4;

/*
         * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por
         * estado:
         * 'SP – R$67.836,43
         * RJ – R$36.678,66
         * MG – R$29.229,88
         * ES – R$27.165,48
         * Outros – R$19.849,53
         * 
         * Escreva um programa na linguagem que desejar onde calcule o percentual de
         * representação que cada estado teve dentro do valor total mensal da
         * distribuidora.
         * '
         */

public class app {
    public static void main(String[] args) {
        
         
        //Arrendodei os valores 
         Faturamento faturamento = new Faturamento();
         //método que preenche o faturamento de acordo com os dados informados na questao
         faturamento.PreencherFaturamento();
         faturamento.imprimirPercentualDeFaturamento();        
        
    }
}
