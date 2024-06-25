package desafio;

import desafio.models.Alimento;
import desafio.models.Cliente;
import desafio.models.EscolherCardapio;
import desafio.models.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Alimento> alimentos = new ArrayList<>();

    private static Cliente cliente = new Cliente();

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        montarCardapio();
        int opcao;

        while(true){
            opcao = new Menu().getOpcao();

            switch (opcao){
                case 1: listarCardapio(); break;
                case 2: escolherAlimento(); break;
                case 3: calcularCalorias(); break;
                case 4: return;
            }
        }
    }

    private static void montarCardapio() {
        alimentos.add(new Alimento("Vegetariano", "Prato", 180));
        alimentos.add(new Alimento("Peixe", "Prato", 230));

        alimentos.add(new Alimento("Abacaxi", "Sobremesa", 75));
        alimentos.add(new Alimento("Sorvete", "Sobremesa", 110));

        alimentos.add(new Alimento("Chá", "Bebida", 26));
        alimentos.add(new Alimento("Suco", "Bebida", 76));
    }

    private static void listarCardapio() {
        // Agrupar alimentos por tipo genérico
        ArrayList<Alimento> pratos = new ArrayList<>();
        ArrayList<Alimento> bebidas = new ArrayList<>();
        ArrayList<Alimento> sobremesas = new ArrayList<>();

        for (Alimento alimento : alimentos) {
            switch (alimento.getTipoAlimento()) {
                case "Prato":
                    pratos.add(alimento);
                    break;
                case "Bebida":
                    bebidas.add(alimento);
                    break;
                case "Sobremesa":
                    sobremesas.add(alimento);
                    break;
                default:
                    break;
            }
        }

        // Imprimir tabela
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-10s | %-15s | %-10s | %-15s | %-10s |\n",
                "Pratos", "Calorias", "Bebidas", "Calorias", "Sobremesas", "Calorias");
        System.out.println("----------------------------------------------------------------------------------------------------");

        int maxSize = Math.max(Math.max(pratos.size(), bebidas.size()), sobremesas.size());
        for (int i = 0; i < maxSize; i++) {
            String pratoNome = i < pratos.size() ? pratos.get(i).getNomeAlimento() : "";
            String pratoCalorias = i < pratos.size() ? String.valueOf(pratos.get(i).getCalorias()) : "";

            String bebidaNome = i < bebidas.size() ? bebidas.get(i).getNomeAlimento() : "";
            String bebidaCalorias = i < bebidas.size() ? String.valueOf(bebidas.get(i).getCalorias()) : "";

            String sobremesaNome = i < sobremesas.size() ? sobremesas.get(i).getNomeAlimento() : "";
            String sobremesaCalorias = i < sobremesas.size() ? String.valueOf(sobremesas.get(i).getCalorias()) : "";

            System.out.printf("| %-15s | %-10s | %-15s | %-10s | %-15s | %-10s |\n",
                    pratoNome, pratoCalorias, bebidaNome, bebidaCalorias, sobremesaNome, sobremesaCalorias);
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    private static void escolherAlimento() {
        Scanner ler = new Scanner(System.in);
        EscolherCardapio alimentoEscolhido = new EscolherCardapio();

        String nomeAlimentoEscolhido = alimentoEscolhido.getAlimentoEscolhido();

        boolean encontrado = false;
        for (Alimento alimento : alimentos) {
            if (alimento.getNomeAlimento().equalsIgnoreCase(nomeAlimentoEscolhido)) {
                if ("Prato".equals(alimento.getTipoAlimento())) {
                    cliente.setPrato(alimento);
                } else if ("Sobremesa".equals(alimento.getTipoAlimento())) {
                    cliente.setSobremesa(alimento);
                } else if ("Bebida".equals(alimento.getTipoAlimento())) {
                    cliente.setBebida(alimento);
                } else {
                    System.out.println("Erro na aplicação");
                }

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Alimento não encontrado no cardápio.");
        } else {
            System.out.println("Você adicionou " + nomeAlimentoEscolhido + " às suas escolhas.");
        }
    }

    private static void calcularCalorias() {
        System.out.println("Você escolheu: "+cliente.calculaCalorias()+" de calorias");
    }


}
