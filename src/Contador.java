import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            //Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
            System.out.println("O programa foi finalizado.");
        } catch (ParametroInvalidosException exception) {
            System.out.println("O segundo paramentro é maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametroInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}

