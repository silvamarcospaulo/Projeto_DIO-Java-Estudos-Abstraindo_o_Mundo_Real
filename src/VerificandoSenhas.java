import java.util.Scanner;
import java.util.regex.*;

public class VerificandoSenhas {
    public static String validarSenha(String senha) {

        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
        boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");

        if (senha.length() < 8) {
            return "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
        }else if ((!temLetraMaiuscula) || (!temLetraMinuscula) || (!temNumero) || (!temCaractereEspecial) || (temSequenciaComum) || (temPalavraComum)){
            return "Sua senha nao atende aos requisitos de seguranca.";
        }
        return "Sua senha atende aos requisitos de seguranca. Parabens!";
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String senha = read.nextLine();

        String mensagem = validarSenha(senha);
        System.out.println(mensagem);
    }
}