
public class Transposition {

    static String cypher(String s, int dim) {

        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < dim; j++) {
                if (i % dim == j) {
                    result[j] = s.charAt(i);
                }

            }

        }

        return "";
    }


    static String decypher(String s, int dim) {

        char[] result = new char[s.length()];

        return "";
    }


    static String cypher(String s, String key) {


        return "";
    }


    static String decypher(String s, String key) {

        return "";
    }

}
