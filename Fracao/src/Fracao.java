public class Fracao {

    private final int numerador;  // não-negativo!
    private final int denominador;  // positivo
    private final boolean sinal;  // true para positivo ou zero; false para negativo

    public Fracao(int numerador, int denominador) {
        this.numerador = Math.abs(numerador);
        this.denominador = Math.abs(denominador);
        this.sinal = numerador * denominador >= 0;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public boolean getSinal() {
        return sinal;
    }

    public Fracao somar(Fracao outra) {


        int numResultado = 1;  // ToDo
        int denomResultado = 1;  // ToDo

        int num = getNumerador();
        int den = getDenominador();

        int a = Aritmetica.mdc(den,outra.denominador);

        int fator1 = den/a;
        int fator2 = outra.denominador/a;

        numResultado = fator1 * outra.numerador + fator2 * num;
        denomResultado = outra.denominador*den/a;


        Fracao resultado = new Fracao(numResultado, denomResultado);
        return resultado;
    }

    public double getValorNumerico() {
        int numerador = getNumerador();
        int denominador = getDenominador();
        int a;
        if(getSinal()){
            a = 1;
        }else{
            a = -1;
        }


        double resp = a*(numerador*1.0)/(denominador*1.0);

        return resp;

          // ToDo IMPLEMENT ME!!!
    }

    public Fracao getFracaoIrredutivel() {
        int a = Aritmetica.mdc();
        return null;  // ToDo IMPLEMENT ME!!!
    }

    public Fracao multiplicar(Fracao outra) {
        return null;  // ToDo IMPLEMENT ME!!!
    }

    @Override
    public String toString() {
        return null;  // ToDo IMPLEMENT ME!!!
    }
}
