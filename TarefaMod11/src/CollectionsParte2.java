import java.util.Scanner;

public class CollectionsParte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar arrays com capacidade de 100 nomes cada (por exemplo)
        String[] masculinos = new String[100];
        String[] femininos = new String[100];

        // Contadores para os índices dos arrays
        int indiceMasculino = 0;
        int indiceFeminino = 0;

        while (true) {
            System.out.println("Digite um nome (ou 'sair' para terminar):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo (M/F):");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculinos[indiceMasculino++] = nome;
            } else if (sexo.equalsIgnoreCase("F")) {
                femininos[indiceFeminino++] = nome;
            } else {
                System.out.println("Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.");
            }
        }

        System.out.println("Grupo Masculino:");
        for (int i = 0; i < indiceMasculino; i++) {
            System.out.println(masculinos[i]);
        }

        System.out.println("Grupo Feminino:");
        for (int i = 0; i < indiceFeminino; i++) {
            System.out.println(femininos[i]);
        }

        scanner.close();
    }
}
