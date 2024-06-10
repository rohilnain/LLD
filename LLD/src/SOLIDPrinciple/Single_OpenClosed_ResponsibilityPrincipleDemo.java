package SOLIDPrinciple;

public class Single_OpenClosed_ResponsibilityPrincipleDemo {
    //why we should use solid principle
        //    -Avoid code Duplicacy
        //    -Easy to maintain
        //    -Easy to Understand
        //    -Flexible software
        //    -Reduce Complexity


    //1. Single Responsibility Principle
        //A class has only one reason to change

    //let's see problem first

     public class Marker{
        String name;
        String color;
        int price;
        int year;
        Marker(String name,String color,int price,int year){
            this.name=name;
            this.color=color;
            this.price=price;
            this.year=year;
        }
    };

    //this Invoice class has-a (relationship) with marker class

    public class Invoice{
         private Marker marker;
         private Integer quantity;
         Invoice(Marker marker,Integer quantity){
             this.marker=marker;
             this.quantity=quantity;
         }
        public int  calculateTotal(){
            return marker.price*quantity;
        }
         void printInvoice(){
             //handles printing of invoice
         }

        void saveToDB(){
             //handles operation of saving to db
        }
    }

    //Now see above invoice class will change if we change price of marker or something (calculateTotal method)
    //if we change something printInvoice method will also change
    //saveToDB will also change
    //so it is not uploading principle of Single Responsibility, there should be one reason to change

    //how to solve it
    //we can seprate out PrintInvoice class and saveToDB class
    public class Invoice{
        private Marker marker;
        private Integer quantity;
        Invoice(Marker marker,Integer quantity){
            this.marker=marker;
            this.quantity=quantity;
        }
        public int  calculateTotal(){
            return marker.price*quantity;
        }
    }

    //Different class which handles print invoice
    public class InvoicePrinter{
        private Invoice invoice;
        InvoicePrinter(Invoice invoice){
            this.invoice=invoice;
        }
        public void printInvoice(){
            //handles printing of invoice
        }
    }


    // Different class which handles saveToDB invoice
    public class SaveInvoiceDB{
        private Invoice invoice;

        SaveInvoiceDB(Invoice invoice){
            this.invoice=invoice;
        }

        public void saveToDB(){
            //handles persisting invoice data to DB
        }
    }

    //now it follows single responsibility principle

    //2. lets see what "O" stands for (Open/Closed Principle)
    //it is for Open for Extension but closed for modification

    //lets see problem first then

    public class SaveInvoiceDB{
        private Invoice invoice;

        SaveInvoiceDB(Invoice invoice){
            this.invoice=invoice;
        }

        public void saveToDB(){
            //handles persisting invoice data to DB
        }
        public void saveToFIle(){
            //handles persisting invoice data to Fle
        }
    }
    //so we have added a saveToFile Method to our previously tested class SaveInvoiceDB
    // so it has modified this class, which is safely tested and deployed
    // so it goes against the principle of open for extension but closed for modification

    //so this is how it done
    interface SaveInvoice{
        public void save(Invoice invoice);
    }

    //now writing logic for SaveInvoiceDB class implementing this inteface
    public class SaveInvoiceDB implements SaveInvoice{
        private Invoice invoice;
        SaveInvoiceDB(Invoice invoice){
            this.invoice=invoice;
        }

        @Override
        public void save(Invoice invoice) {
            //handling saving to DB
        }
    }

    //now writing logic for SaveInvoiceFile class implementing this inteface
    public class SaveInvoiceFile implements SaveInvoice{
        private Invoice invoice;
        SaveInvoiceFile(Invoice invoice){
            this.invoice=invoice;
        }

        @Override
        public void save(Invoice invoice) {
            //handling saving to FIle
        }
    }

    //so it is following Open for extension but not modification principle
}
