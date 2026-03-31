package bridge;

import implementacao.CarroImplementacao;

public class CorridaDuasPortas extends Corrida {
    public CorridaDuasPortas(CarroImplementacao carro) {
        super(carro);
    }

    @Override
    public void mostrarColocacao(int posicao) {
        System.out.println("Posição " + posicao + ": " + carro.getMarca() + " - Duas Portas");
    }
}
