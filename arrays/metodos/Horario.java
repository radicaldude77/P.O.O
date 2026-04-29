import java.time.LocalTime;
import java.util.Scanner;

public class Horario {
    public static void saudacaoHorario(String nome) {
        LocalTime agora = LocalTime.now();
        int hora = agora.getHour();
        
        String saudacao;
        if (hora < 12) {
            saudacao = "Bom dia";
        } else if (hora < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }
        
        System.out.println(saudacao + ", " + nome + "!");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        saudacaoHorario(nome);
        
        scanner.close();
    }
}