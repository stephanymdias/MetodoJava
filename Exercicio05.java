package ExerciciosMetodo;

public class Exercicio05 {

        static int plusMethod(int x, int y){
            return x + y;
        }
        static double plusMethod(double x, double y){
            return x + y;
        }

        public static void main(String[]args) {
            int numero1 = plusMethod(8, 5);
            double numero2 = plusMethod(4.3, 6.26);
            System.out.println("int: " + numero1);
            System.out.println("double: " + numero2);
        }
    }

