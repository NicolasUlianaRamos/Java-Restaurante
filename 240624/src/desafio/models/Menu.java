package desafio.models;

import java.util.Scanner;

public class Menu {
    public int getOpcao(){
        Scanner ler = new Scanner(System.in);

        System.out.println("--- MENU ---");
        System.out.println("1. Cardapio");
        System.out.println("2. Escolher Alimento");
        System.out.println("3. Calcule as calorias que você ja escolheu");
        System.out.println("4. Sair");

        System.out.print("Digite o numero do que você quer fazer: ");

        return ler.nextInt();
    }
}
