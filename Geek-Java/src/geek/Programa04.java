package geek;

public class Programa04{
    public static void main(String[] args){
        int num = 7;

        if(num > 5){
            System.out.println("O número é maior");
        }else if(num == 5) {
        	System.out.println("O número é igual a "+num);
        }else if(num % 2 == 0) {
        	System.out.println("O número é Menor e Par");
        }
        else{
            System.out.println("O número é Menor e Impar");
        }
    }
}