import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double C, F;
        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        F = sc.nextInt();
        sc.close();
        C = 5*((F-32)/9);
        System.out.println("A temperatura digitada corresponde a " + C + " graus Celsius");
    }
}

