package constructor_method;

public class SingleToneConcept {

    private SingleToneConcept(){

        System.out.println("Fouzia apu wants kochu");

    }

    private static SingleToneConcept kochu = new SingleToneConcept();

    public static SingleToneConcept getInstance(){



        return kochu;
    }

}
