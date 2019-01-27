import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner nums=new Scanner(System.in);
        int num1;
        int num2;
        int menor = 0;
        int maior=0;
        System.out.println("insira um número:");
        num1 = nums.nextInt();

        System.out.println("Insira outro número:");
        num2 = nums.nextInt();

        if (num1<num2){
            menor = num1;
            maior = num2;
        }else{
            if (num2<num1){
                menor=num2;
                maior=num1;
            }

            }
        System.out.println("Os números entre,"+menor+"e"+maior+"são;");

        while (menor<=maior){
            System.out.println(menor);
            menor++;

        }

        }

//simple exercise



    }

