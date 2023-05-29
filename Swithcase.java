public class Swithcase {
    
    public static void main(String[] args) {
        int opcao =1;
        System.out.println("Opção 1: Lanche Natural");
        System.out.println("Opção 2: Fritura.");
        System.out.println("Opção 3: Arroz e Feijão.");
        System.out.println("\nSelecione sua Refeição: ");


        switch (opcao) {
            case 1:
                System.out.println("\nOpção 1 selecionada.");
                break;
            case 2:
                System.out.println("\nOpção 2 selecionada");
                break;
            case 3:
                System.out.println("\nOpção 3 selecionada.");
                break;    
            default:
                System.out.println("\nOpção inválida.");
                break;
        }
    }
}
