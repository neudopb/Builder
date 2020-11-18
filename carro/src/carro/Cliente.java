package carro;

/**
 *
 * @author Neudinho Paulino
 */
public class Cliente {

    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria(new FiatBuilder());
        
        concessionaria.construirCarro();
        
        concessionaria.getCarro();
    }
    
}
