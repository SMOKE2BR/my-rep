package bridge;

import implementacao.CarroImplementacao;

public class CorridaQuatroPortas extends Corrida {
    public CorridaQuatroPortas(CarroImplementacao carro) {
        super(carro);
    }

    @Override
    public void mostrarColocacao(int posicao) {
        System.out.println("Posição " + posicao + ": " + carro.getMarca() + " - Quatro Portas");
    }
}
