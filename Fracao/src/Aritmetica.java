public class Aritmetica {
    public static int mdc(int a, int b){
        int maior;
        int menor;
        if(a>=b){
            maior = a;
            menor = b;
        }else{
            maior = b;
            menor = a;
        }
        while(menor!=0){
            int resto = maior%menor;
            maior = menor;
            menor = resto;
        }
        return maior;
    }

}
