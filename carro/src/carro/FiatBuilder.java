package carro;

/**
 *
 * @author Neudinho Paulino
 */
public class FiatBuilder extends CarroBuilder {

    @Override
    public void bMontadora() {
        super.carro.setMontadora("Fiat");
    }

    @Override
    public void bModelo() {
        super.carro.setModelo("Mobi");
    }

    @Override
    public void bPreco() {
        super.carro.setPreco(39.000f);
    }
    
    @Override
    public void bAnoFabricacao() {
        super.carro.setAnoFabricacao(2019);
    }
    
    
}
