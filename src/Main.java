<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hamburguer {
    private String nome;
    private double preco;

    public Hamburguer(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}

class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " | Tel: " + telefone;
    }
}

class Pedido {
    private Cliente cliente;
    private List<Hamburguer> itens = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(Hamburguer h) {
        itens.add(h);
    }

    public double calcularTotal() {
        double total = 0;
        for (Hamburguer h : itens) {
            total += h.getPreco();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println(cliente);
        System.out.println("Itens do pedido:");
        for (Hamburguer h : itens) {
            System.out.println("- " + h);
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}

=======
import bridge.Corrida;
import bridge.CorridaDuasPortas;
import bridge.CorridaQuatroPortas;
import implementacao.ChevroletDuasPortas;
import implementacao.FordQuatroPortas;
import implementacao.ToyotaDuasPortas;

public class Main {
    public static void main(String[] args) {
        Corrida corrida1 = new CorridaDuasPortas(new ChevroletDuasPortas());
        Corrida corrida2 = new CorridaQuatroPortas(new FordQuatroPortas());
        Corrida corrida3 = new CorridaDuasPortas(new ToyotaDuasPortas());

        corrida1.mostrarColocacao(1);
        corrida2.mostrarColocacao(2);
        corrida3.mostrarColocacao(3);
    }
}
>>>>>>> 2e47a03b3332510ad3a1593cd49f7c1856856adc
