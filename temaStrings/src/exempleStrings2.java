import javax.swing.plaf.synth.SynthOptionPaneUI;

public class exempleStrings2 {
    public static void main(String[] args) {
        //Los Strings en Java son objetos inmutables
        //no pueden cambiar de valor.
        String s = "Es Liceu";
        String s2 = s.toUpperCase();


        //Podemos recuperar dentro la misma variable el nuevo objeto
        //creado por el metodo "toUpperCase", pero tenemos que entender
        //que se trata de un objeto nuevo, no es el mismo
        s = s.toUpperCase();

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s.toUpperCase());


        String s3 = "Buenos dias";

        String sumaS = s3 + s;

        System.out.println(sumaS);
    }
}
