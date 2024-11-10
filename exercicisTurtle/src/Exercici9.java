public class Exercici9 {
    public static void main(String[] args) {
        Turtle t = new Turtle(800, 800);
        int nc = 9;
        int costado = 90;

        double gamma = 360d/(double) nc;
        double beta = (180d - gamma) / 2d;
        double hipotenusa = (((double)costado)/2d) / (cos(beta));

        for (int i = 0; i < nc; i++) {
            t.goTo(0,0);
            t.resetAngle();
            t.turnRight((int) (gamma*(double)i));
            triangulo(t, hipotenusa, beta, costado);

        }

        t.setDelay(300);
        t.markCursor();
        t.show();
    }

    public  static double cos(double angulo) {
        double anguloRadian = angulo*Math.PI / 180d;
        return Math.cos(anguloRadian);
    }

    public static void triangulo(Turtle t,double hipotenusa, double beta, int costado){
        t.forward((int) hipotenusa);
        t.turnRight(180);
        t.turnRight((int) beta);
        t.forward(costado);
        t.turnRight(180);
        t.turnRight((int) beta);
        t.forward((int) hipotenusa);
    }
}