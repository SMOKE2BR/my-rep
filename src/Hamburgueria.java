import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hamburgueria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cardápio
        List<Hamburguer> cardapio = new ArrayList<>();
        cardapio.add(new Hamburguer("Clássico", 20.0));
        cardapio.add(new Hamburguer("Cheddar Bacon", 25.0));
        cardapio.add(new Hamburguer("Vegano", 22.0));
        cardapio.add(new Hamburguer("Duplo", 28.0));

        // Cadastro do cliente
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();
        Cliente cliente = new Cliente(nome, telefone);

        Pedido pedido = new Pedido(cliente);

        System.out.println("\nBem-vindo à Hamburgueria!");
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nCardápio:");
            for (int i = 0; i < cardapio.size(); i++) {
                System.out.println((i + 1) + ". " + cardapio.get(i));
            }

            System.out.print("Escolha o número do hambúrguer (ou 0 para finalizar): ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                continuar = false;
            } else if (escolha > 0 && escolha <= cardapio.size()) {
                pedido.adicionarItem(cardapio.get(escolha - 1));
                System.out.println(cardapio.get(escolha - 1).getNome() + " adicionado ao pedido!");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        System.out.println("\nResumo do pedido:");
        pedido.mostrarPedido();

        scanner.close();
    }
}
