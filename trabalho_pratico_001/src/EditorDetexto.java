/*JULIANO MACHADO DA SILVA
Matricula: 25108646-8 */
public class EditorDetexto {
    public String editorDeTexto(String texto){
        texto = texto.toLowerCase();
        texto = removeEspacosInicioFim(texto);
        return texto;
    }
    public String removeEspacosInicioFim (String texto){
        //texto = texto.trim(); faz a mesma coisa que o metodo a baixo:
        for (int i = 0 ; i < texto.length(); i++){
            if (i ==0 && texto.charAt(i) == ' '){
                texto = texto.substring(i+1);
                i--;
            }
        }
        for (int j = texto.length()-1; j > 0; j--){
            if (texto.charAt(j) == ' '){
                texto = texto.substring(0,j);
            } else {
                j = -1;
            }
        }
        return texto;
    }
}
