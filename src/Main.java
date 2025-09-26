import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Quantas horas por dia você pretende estudar? ");
        int horasDia = entradaUsuario.nextInt();

        System.out.println("Quantos dias na semana você pretende estudar? ");
        int diasSemana = entradaUsuario.nextInt();

        final int[] semanasMes = {4, 5};
        int mesAtual;

        while (true) {
            System.out.println("Quantas semanas tem esse mês? " + semanasMes[0] + " ou " + semanasMes[1] + "?");
            mesAtual = entradaUsuario.nextInt();

            if (mesAtual == semanasMes[0] || mesAtual == semanasMes[1]) {
                break;
            } else {
                System.out.println("Por favor, digite " + semanasMes[0] + " ou " + semanasMes[1] + ".");
            }
        }

        int[] horasPorSemana = new int[mesAtual];
        int totalSemanalPlanejado = horasDia * diasSemana;

        // Preenche cada semana com o total planejado
        for (int i = 0; i < mesAtual; i++) {
            horasPorSemana[i] = totalSemanalPlanejado;
        }

        int totalMensal = 0;
        System.out.println("\nRelatório de Estudos:");
        for (int i = 0; i < horasPorSemana.length; i++) {
            System.out.println("Semana " + (i + 1) + ": " + horasPorSemana[i] + " horas");
            totalMensal += horasPorSemana[i];
        }

        System.out.println("-------------------------");
        System.out.println("- Total mensal: " + totalMensal + " horas");
        double mediaSemanal = (double) totalMensal / mesAtual;
        System.out.printf("- Média semanal: %.2f horas%n", mediaSemanal);
        System.out.println("Continue firme! 🚀");

        entradaUsuario.close();
    }
}
