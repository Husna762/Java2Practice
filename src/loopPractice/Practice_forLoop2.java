package loopPractice;

public class Practice_forLoop2 {


    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println("do more study plz ");

        }
        System.out.println("====Method calling =====");
        Practice_forLoop2 ac = new Practice_forLoop2();
        Practice_forLoop2 xyz = new Practice_forLoop2();


        System.out.println("======Display printing========");


    }

    public void doDivision() {
        int num1 = 33;
        int num2 = 15;
        int total = num1 - num2;
        System.out.println("Division Value is " + total);

    }

    public void display() {

        System.out.println("Display the number of iteration ");
    }


}
