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


    public static void main(String[] args) {  // psvm <TAB>
        System.out.println("Oi!");  // sout <TAB>

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        int nArmarios = Integer.parseInt(args[0]);
        System.out.println("Abertos ==> " + simularArmarios(nArmarios));
        System.out.println("Abertos ==> " + contarArmariosAbertos(nArmarios));

        int x = 7;
        int y = 20;

        if (x > y || y > 18 && x < 8) {
            System.out.println("ok");
        }

        System.out.println("valor é " + (x > 5 ? "alto" : "baixo"));


    }
}
