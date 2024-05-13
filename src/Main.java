import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        n1 = scan.nextInt();
        System.out.println("Segundo número");
        n2 = scan.nextInt();
        try{
            contar(n1,n2);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar (int n1, int n2) throws ParametrosInvalidosException {
        if (n2 < n1) {
            throw new ParametrosInvalidosException();
        }
        int contagem = n2 - n1;
        for(int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo número: "+i);
        }
    }
}