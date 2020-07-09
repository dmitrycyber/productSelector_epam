package by.epamtc.selector.services.announcer;

public class SimpleAnnouncer implements Announcer {

    public void enterType(){
        System.out.println("Enter type of product: ");
    }

    public void enterProperty(){
        System.out.println("Enter property of product: ");
    }

    public void enterValue(){
        System.out.println("Enter value property of product: ");
    }
}
