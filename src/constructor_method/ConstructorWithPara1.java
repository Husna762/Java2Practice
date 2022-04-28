package constructor_method;

public class ConstructorWithPara1 {

    String foundation = "Mac";
    int price = 45;
    int quantity = 4;

public ConstructorWithPara1 ( String brandName, int price, int quantity    ){

this.foundation = brandName;
this.price = price;
this.quantity= quantity;





}
    public static void main(String[] args) {


ConstructorWithPara1 obj = new ConstructorWithPara1("Mac", 40,5);

        System.out.println("I bought foundation from " +obj.foundation +" each price is " + obj.price + " I bought only "+ obj.quantity+ " piece." );



    }




}
