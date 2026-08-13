public class Principal {

    static int simularArmarios(int n) {

        boolean[] armarios = new boolean[n+1];  // não usaremos a posição 0 para nada

        for (int crianca = 1; crianca <= n; crianca++) {
            for (int armario = 1; armario <= n; armario++) {
                if (armario % crianca == 0) {
                    armarios[armario] = !armarios[armario];  // flip
                }
            }
        }

        int contAbertos = 0;
        int i = 1;
        while (i <= n) {
            if (armarios[i]) {  // == true
                contAbertos++;
            }
            i++;
        }

        return contAbertos;
    }

    static int contarArmariosAbertos(int n) {
        return (int) Math.sqrt(n);
    }


    public static void main(String[] args) {  // psvm
        System.out.println("Oi!");  // sout
        System.out.println("Abertos ==> " + simularArmarios(18));
        System.out.println("Abertos ==> " + contarArmariosAbertos(18));

        int x = 7;
        int y = 20;

        if (x > y || y > 18 && x < 8) {
            System.out.println("ok");
        }

        System.out.println("valor é " + (x > 5 ? "alto" : "baixo"));


    }
}
