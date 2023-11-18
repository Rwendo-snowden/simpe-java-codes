import java.util.Scanner;

class mainClass{

    public static void main(String[] args) {
         
        try (Scanner input = new Scanner(System.in)) {

            // decleare the first variable 
            //note: make sure you import the java .util.scanner
            System.out.println("enter the first number");
            int x=  input.nextInt();
             System.out.println("enter the second number");
             int y=   input.nextInt();

            int z= x+y;
            System.err.println("The answer is : "+z);
        }



    }
}