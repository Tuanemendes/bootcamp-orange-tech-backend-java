public class DivisaoNaoExataException extends Exception{
    private int numerodor;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerodor, int denominador) {
        super(message);
        this.numerodor = numerodor;
        this.denominador = denominador;
    }
}
