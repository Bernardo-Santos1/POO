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


        int numResultado = 1;
        int denomResultado = 1;

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
    }

    public Fracao getFracaoIrredutivel() {
        int a = Aritmetica.mdc(getNumerador(), getDenominador());

        int numerador = getNumerador()/a;
        int denominador = getDenominador()/a;

        int sinal;

        if(getSinal()){
            sinal = 1;
        }else{
            sinal =-1;
        }

        numerador *= sinal;

        Fracao irredutivel = new Fracao(numerador, denominador);

        return irredutivel;
    }

    public Fracao multiplicar(Fracao outra) {
        int num1 = getNumerador();
        int denom1 = getDenominador();

        int num2 = outra.getNumerador();
        int denom2 = outra.getDenominador();

        int sinal = 1;

        if (!getSinal() || !outra.getSinal()){
            sinal = -1;
        }

        int finalNum = num1 * num2 * sinal;
        int finalDenom = denom1 * denom2;

        Fracao multiplicada = new Fracao(finalNum, finalDenom);


        return multiplicada;
    }

    @Override
    public String toString() {
        int numerador = getNumerador();
        int denominador = getDenominador();
        String resp = "";

        if(numerador == 0){
            resp = "0";
            return resp;
        }

        if(!getSinal()){
            resp = "-";
        }

        if (denominador == 1){
            resp += numerador;
            return resp;
        }

        resp += numerador + "/" + denominador;

        return resp;
    }
}
