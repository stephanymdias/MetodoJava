package ExerciciosMetodo;

public class Exercicio04 {

    static int plusMethodInt(int x, int y){
        return x + y;
    }
    static double plusMethodDouble(double x, double y){
        return x + y;
    }

    public static void main(String[]args) {
        int numero1 = plusMethodInt(8, 5);
        double numero2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + numero1);
        System.out.println("double: " + numero2);
    }
}
