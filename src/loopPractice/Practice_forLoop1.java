package loopPractice;

public class Practice_forLoop1 {

    public static void main(String[] args) {
//
////Increment
        for (int i = 1; i <= 5; i++) {

            System.out.println("Eid Mubarak");

        }

        Practice_forLoop1 obj = new Practice_forLoop1();
        Practice_forLoop1.doMultiplication();
        for (int i = 0; i <= 7; i++) {

            Practice_forLoop1.doMultiplication();


        }
        System.out.println("#################");

        Practice_forLoop1 print = new Practice_forLoop1();
        print.display();

        for (int i = 1; i <= 8; i++) {

            print.display();
            System.out.println("Number of " + i);

        }
//Decrement
        System.out.println(" --------------------------------- ");

        for ( int i = 10; i>=5; i-- ){

            System.out.println(" Eid is knocking at the door ");


        }

    }

    public static void doMultiplication() {

        int num1 = 7;
        int num2 = 8;
        int multi = num1 * num2;
        System.out.println("Multiplication value " + multi);


    }

    public void display() {
        System.out.println("Display the number of iteration");

    }


}
