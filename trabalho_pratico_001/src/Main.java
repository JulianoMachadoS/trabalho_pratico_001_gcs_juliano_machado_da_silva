import java.util.Scanner;

/*JULIANO MACHADO DA SILVA
Matricula: 25108646-8 */
public class Main {
    public static void main(String[] args) {
        EditorDetexto et = new EditorDetexto();
        System.out.print("\f");
        String textoTeste = "   Palavra Para teste  ";
        imprimeMenu ();
        int contador = 1;
        boolean loop = false;
        while (!loop == true){// inicio do menu de teste
            System.out.println("Texto original: (" + textoTeste + ")");
            System.out.println("Texto editado: (" + et.editorDeTexto(textoTeste)+")");
            loop = parasistema(contador);
            contador ++;
        }
    }
    public static boolean parasistema(int contador){
        Scanner teclado = new Scanner (System.in);
        System.out.println("\nDigite 1 para SAIR ou qualquer outra coisa para Reiniciar");
        String sair = teclado.nextLine();
        if (sair.indexOf("1") >= 0) {
            System.out.println("FIM DO TESTE\n");
            return true;
        }
        System.out.println("----------------- TESTE REINICIADO / teste "+ contador + " ----------");
        return false;
    }
    public static void imprimeMenu (){
        System.out.println("-----------------TESTE DO EDITOR-----------------\n");
    }
}