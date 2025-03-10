public class Main2 {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.getName();
        Piano p = new Piano();
        p.getName();
    }
}

abstract class Instrumennt{
    abstract void play();
    void getName(){
        System.out.println("Name of Instrument");
    }
}

class Guitar extends  Instrumennt {

    @Override
    void play() {
        System.out.println("Guitar playing note");
    }
    @Override
    void getName(){
        System.out.println("Guitar");
    }
}

class Piano extends  Instrumennt{

    @Override
    void play() {
        System.out.println("Piano playing note");
}
}
