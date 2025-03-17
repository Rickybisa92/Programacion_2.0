import java.util.Arrays;

public class Word {
String str;
char[] array;
    Word(String s) {
        this.str = s;
        array = new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            array[i] = '-';
        }
    }

    public String toString() {

        return Arrays.toString(array);
    }

    boolean isGuessed() {
        for (int i = 0; i <this.array.length ; i++) {
            if (this.array[i] == '-'){
                return false;
            }
        }
        return true;
    }

    boolean doGuess(char c) {
        boolean result = false;
        for (int i = 0; i <this.str.length() ; i++) {
            if (str.charAt(i) == c){
             this.array[i] = c;
                result = true;
            }
        }
        return result;
    }
}


