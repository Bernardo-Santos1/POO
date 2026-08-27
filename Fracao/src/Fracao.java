public class Fracao {

    private final int numerador;  // não-negativo!
    private final int denominador;  // positivo
    private final boolean sinal;  // true para positivo ou zero; false para negativo

    public Fracao(int numerador, int denominador) {
        this.numerador = Math.abs(numerador);
        this.denominador = Math.abs(denominador);
        this.sinal = numerador * denominador >= 0;
    }

    public Fracao somar(Fracao outra) {
        return null;  // ToDo IMPLEMENT ME!!!
    }

    public double getValorNumerico() {
        return 0;  // ToDo IMPLEMENT ME!!!
    }

    public Fracao getFracaoIrredutivel() {
        return null;  // ToDo IMPLEMENT ME!!!
    }

    public Fracao multiplicar(Fracao outra) {
        return null;  // ToDo IMPLEMENT ME!!!
    }
}
