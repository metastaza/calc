import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        float a = sc.nextFloat();
        System.out.println("+,-,*,/");
        char operation = sc.next().charAt(0);
        System.out.println("Введите второе число");
        float b = sc.nextFloat();

        if (operation == '+'){
            float result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
            else if  (operation == '-'){
            float result = a - b;
                System.out.println(a + " - " + b + " = " + result);
            }
                else if (operation == '*'){
            float result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                }
                    else if (operation == '/'){
            float result = a / b;
                        System.out.println(a + " / " + b + " = " + result);
                    }

        }
    }
