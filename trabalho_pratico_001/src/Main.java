import java.util.Scanner;

/*JULIANO MACHADO DA SILVA
Matricula: 25108646-8 */
public class Main {
    public static void main(String[] args) {
        EditorDetexto et = new EditorDetexto();
        String textoTeste = "   Palavra Para teste  ";
        System.out.println("Texto original: " + textoTeste);
        System.out.println(et.editorDeTexto(textoTeste));
    }
}