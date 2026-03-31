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
