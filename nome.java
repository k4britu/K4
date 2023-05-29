import java.util.Scanner;

public class nome {

    public static void main(String[] args) {
        Scanner nomeUsuario = new Scanner(System.in);

        System.out.print("Como você se chama?");
        String nome = nomeUsuario.nextLine();
        System.out.print(" oi " + nome + " ! ");
    } 

}
