package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        System.out.println("Hello World!");

        //boolean x = isPalindrome("arribalabirra");
        //System.out.println(x);

        //HACER!
        // Integer i = romanToDecimal("XIV");
        //System.out.println(i);

        //String aux = revert("Arriba la Birra");
        //System.out.println(aux);

       // String aux = "Soy Independiente, aunque no gano la libertadores desde 1985, sigo siendo el máximo campeón con 7 copas";
        //countTypeCharacter(aux);

        //String aux = cesar("abcde");
        //System.out.println(aux);
    }


    /*
    1) Realizar un método el cual reciba un String y devuelva un Boolean si este es un
    palíndromo. (Palabra o expresión que es igual si se lee de izquierda a derecha que de
    derecha a izquierda.)
    Input: “Arriba la Birra”
    Output: True
     */
    public static boolean isPalindrome(String s) {
        boolean flag = false;

        s = s.toLowerCase().replace(" ", "");

        String aux = new StringBuilder(s).reverse().toString();
        if (aux.equals(s)) {
            flag = true;
        }
        return flag;
    }

    /*
    Escribir un método que, dado un String, transforme de Número Romano a Integer.
    Input: “XIV”
    Output: 14
     */
   /* public static Integer romanToDecimal(String s) {
        Integer count = 0;

        ArrayList<char> listChar = new ArrayList<>();


        s = s.toLowerCase().replace("I", "1").replace("V", "5")
                .replace("X", "10").replace("L", "50").replace("C", "100")
                .replace("D", "500").replace("M", "1000");
        for (Integer i = 0; i < s.length(); i++) {
            listChar.add(s.charAt(i));
        }
        for(Integer i = 0; i < listChar.size(); i++){
            count = listChar.get(i);
        }
        return count;
    }
*/

    /*
    ) Escribir un método, que dado un String reordena las palabras de atrás hacia adelante
    Input: “Arriba la Birra”
    Output: “Birra la Arriba”
     */
    public static String revert(String string) {
        String[] array = string.split(" ");
        String aux = "";
        for (String s : array) {
            aux = s + " " + aux;
        }
        return aux;
    }


    /*
    Escribir un método, que dado un String cuente diferentes tipos de caracteres. Deberá
    imprimir el número de letras, dígitos y espacios en blanco de la cadena.
    Input: “Soy Independiente, aunque no gano la libertadores
    desde 1985, sigo siendo el máximo campeón con 7 copas”
    Output: N/A
    Screen: Dígitos: 5 Letras: 80 Espacios: 16
     */
    public static void countTypeCharacter(String string) {
        Integer digits = 0;
        Integer letters = 0;
        Integer spaces = 0;
        for (Integer i = 0; i < string.length(); i++) {

            if (Character.isSpaceChar(string.charAt(i))) {
                spaces = spaces + 1;
            } else if (Character.isLetter(string.charAt(i))) {
                letters = letters + 1;
            } else if (Character.isDigit(string.charAt(i))) {
                digits = digits + 1;
            }
        }
        System.out.println("Digitos: " + digits + " Letras: " + letters + " Espacios: " + spaces);
    }


    /*
    5)Realizar un método, el cual reciba un String y realice el cifrado Caesar. Se debe cambiar
    cada letra por la siguiente.
    Input: “abcde”
    Output: “bcdef"
     */
    public static String cesar(String string) {
        char[] arrayChar = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            arrayChar[i] = (char) (string.charAt(i) + 1);
        }
        string = String.copyValueOf(arrayChar);//pasa a un string un arreglo de chars
        return string;
    }
}
