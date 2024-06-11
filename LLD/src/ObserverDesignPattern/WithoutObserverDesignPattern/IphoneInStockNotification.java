package ObserverDesignPattern.WithoutObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneInStockNotification {
    private List<User>notificationUserList=new ArrayList<User>();
    private Integer noOfIphones;
    void addUser(User user){
        notificationUserList.add(user);
    }

    void notifyPeoples(){
        if(noOfIphones>0){
            //notify people in this method;
        }
    }

    void setNoOfIphones(Integer quantity){
        noOfIphones=quantity;
    }

    Integer getNoOfIphones(){
        return noOfIphones;
    }

    //problems with this approach

//    Tight Coupling: The IphoneInStockNotification class directly manages a list of
//    users and their notifications. This makes the class less modular and more
//    difficult to maintain. It goes against also Single Responsibility Principle also
//    Scalability: As the number of users grows, the notification logic could become more
//    complex and less efficient

}
