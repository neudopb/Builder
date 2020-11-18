package carro;

/**
 *
 * @author Neudinho Paulino
 */
public class Concessionaria {
    
    private CarroBuilder montadora;
    
    public Concessionaria(CarroBuilder montadora) {
        this.montadora = montadora;
    }
    
    public void construirCarro() {
        this.montadora.bMontadora();
        this.montadora.bModelo();
        this.montadora.bPreco();
        this.montadora.bAnoFabricacao();
    }
    
    public void getCarro() {
        System.out.println("\nMONTADORA: " + this.montadora.getCarro().getMontadora() +
                "\nMODELO: " + this.montadora.getCarro().getModelo() + 
                "\nPREÇO: " + this.montadora.getCarro().getPreco() + 
                "\nANO FABRICAÇÃO: " + this.montadora.getCarro().getAnoFabricacao());
    }
}
