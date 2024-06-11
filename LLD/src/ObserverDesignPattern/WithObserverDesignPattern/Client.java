package ObserverDesignPattern.WithObserverDesignPattern;


public class Client {
    public static void main(String[] args) {
        IPhoneInStockNotification iPhoneInStockNotification=new IPhoneInStockNotification();
        iPhoneInStockNotification.addObserver(new User("Rohil"));
        iPhoneInStockNotification.addObserver(new User("Nikita"));
        iPhoneInStockNotification.addObserver(new User("Romeo"));
        iPhoneInStockNotification.addObserver(new User("Anurag"));

        iPhoneInStockNotification.setNoOfIphones(0);//first time when noOfIphones becomes out of stock
        iPhoneInStockNotification.setNoOfIphones(10);//notify people as it becomes in stock
        iPhoneInStockNotification.setNoOfIphones(15);//will not notify as they were previously available and weren't out of stock

    }
}
