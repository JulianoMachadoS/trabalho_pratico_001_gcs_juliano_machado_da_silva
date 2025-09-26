import java.util.Scanner;

/*JULIANO MACHADO DA SILVA
Matricula: 25108646-8 */
public class Main {
    public static void main(String[] args) {
        EditorDetexto et = new EditorDetexto();
        System.out.print("\f");
        String textoTeste = "   Palavra Para teste  ";

        boolean loop = false;
        while (!loop == true){// inicio do menu de teste
            System.out.println("Texto original: " + textoTeste);
            System.out.println(et.editorDeTexto(textoTeste));
            loop = parasistema();
        }
    }
    public static boolean parasistema(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("\nDigite 1 para SAIR ou qualquer outra coisa para Reiniciar");
        String sair = teclado.nextLine();
        if (sair.indexOf("1") >= 0) {
            System.out.println("FIM DO TESTE\n");
            return true;
        }
        System.out.println("----------------- TESTE REINICIADO ---------------------");
        return false;
    }
}