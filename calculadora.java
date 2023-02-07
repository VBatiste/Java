import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        boolean op ;
        Scanner objChoice = new Scanner(System.in) ;
        Scanner objChoice2 = new Scanner(System.in) ;
        Scanner objNum1 = new Scanner(System.in) ;
        Scanner objNum2 = new Scanner(System.in) ;
        do{
        System.out.println("//////////////////////////////");
        System.out.println("BEM VINDO A CALCULATRON 1.0");
        System.out.println("//////////////////////////////");
        System.out.println("porfavor escoha o primeiro numero da operação:");
        int num1 = objNum1.nextInt();
        System.out.println("porfavor escoha o primeiro numero da operação:");
        int num2 = objNum2.nextInt();
        System.out.println("porfavor escoha sua operação que procura fazer:");
        System.out.println("1.soma");
        System.out.println("2.multiplicacao");
        System.out.println("3.divisao");
        System.out.println("4.subtracao");
        int choice1 = objChoice.nextInt();
        
      switch(choice1){
          case 1:
            System.out.println("////////////////////////");
            System.out.println(num1 + num2);          
          break;
          case 2:
            System.out.println("////////////////////////");
            System.out.println(num1 * num2);
          break;
          case 3:
            System.out.println("////////////////////////");
            System.out.println(num1 / num2);
          break;
          case 4:
            System.out.println("////////////////////////");
            System.out.println(num1 - num2);
          break;
       }
        System.out.println("deseja fazer outra operação?? : 1 - sim ; 2 - não");
        int choice2 = objChoice2.nextInt();
        switch(choice2){
          case 1:
            op = false;
          break;
          case 2:
            System.out.println("Obrigado por utilizar essa aplicação");
            op = true;
          break;    
        }
      }while(op = false);
        
    }
}
