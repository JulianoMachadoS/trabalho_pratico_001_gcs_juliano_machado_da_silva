/*JULIANO MACHADO DA SILVA
Matricula: 25108646-8 */
public class EditorDetexto {
    public String editorDeTexto(String texto){
        texto = texto.toLowerCase();
        texto = removeEspacosInicioFim(texto);
        texto = removeSimbolosDoInico(texto);
        texto = removeSimbuloDoFinal(texto);
        texto = espacoDepoisDaVirgula(texto);
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
    public String removeSimbuloDoFinal (String texto){
        for (int i = 0; i < texto.length(); i++){
            if (i == texto.length()-1){
                if ( ehSimbulo(texto.charAt(i)) && (i != '!' && i != '?' && i != '¡' && i != '¿' && i != '.')){
                    texto = texto.substring(0,i);
                    i--;
                    i--;
                }
            }

        }
        return texto;
    }
    public String espacoDepoisDaVirgula (String texto){
        for (int i = 0; i < texto.length(); i++){
            // em i é uma virgula E em i+1 letra ou Simbulo -> adiciona espaço e depois adiciona o restante da string
            if (ehVirgula(texto.charAt(i)) && (!ehNumero(texto.charAt(i+1)) || ehSimbulo(texto.charAt(i+1)))){
                texto = texto.substring(0,i+1) + " " + texto.substring(i+1,texto.length());
            }
        }
        return texto;
    }
    public boolean ehVirgula(char letra){
        if(letra == ','){
            return true;
        }
        return false;
    }
    public boolean ehLetradoAlfabetoAZ(char letra){
        letra = Character.toLowerCase(letra);
        if (letra == 'a' || letra == 'b' || letra == 'c' || letra == 'd' || letra == 'e' || letra == 'f' ||
                letra == 'g' || letra == 'h' || letra == 'i' || letra == 'j' || letra == 'k' || letra == 'l' ||
                letra == 'm' || letra == 'n' || letra == 'o' || letra == 'p' || letra == 'q' || letra == 'r' ||
                letra == 's' || letra == 't' || letra == 'u' || letra == 'v' || letra == 'w' || letra == 'x' ||
                letra == 'y' || letra == 'z'){
            return true;
        }
        return false;
    }
    public boolean ehNumero(char letra){
        letra = Character.toLowerCase(letra);
        if (letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5' ||
                letra == '6' || letra == '7' || letra == '8' || letra == '9' || letra == '0' ){
            return true;
        }
        return false;
    }
    public boolean ehSimbulo (char letra){
        letra = Character.toLowerCase(letra);
        if (ehLetradoAlfabetoAZ(letra) || letra == ' ' || ehNumero(letra)){
            return false;
        }
        return true;
    }
    public String removeSimbolosDoInico(String texto){
        for (int i =  0 ; i < texto.length(); i++) {
            if (i == 0 && ehSimbulo(texto.charAt(i)) && i != '¿' && i != '¡'){
                texto = texto.substring(i+1);
                i--;
            }
        }
        return texto;
    }
}
