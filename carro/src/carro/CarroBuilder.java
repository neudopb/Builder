package carro;

/**
 *
 * @author Neudinho Paulino
 */
public abstract class CarroBuilder {
    
    protected CarroProduct carro;

    public CarroBuilder() {
        this.carro = new CarroProduct();
    }
    
    public abstract void bMontadora();
    
    public abstract void bModelo();
    
    public abstract void bPreco();
    
    public abstract void bAnoFabricacao();
    
    public CarroProduct getCarro() {
        return this.carro;
    }
    
}
