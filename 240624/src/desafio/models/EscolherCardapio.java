package desafio.models;

import java.util.Scanner;

public class EscolherCardapio {
    public String getAlimentoEscolhido(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do alimento que você quer do cardapio: ");

        return ler.nextLine();
    }
}
