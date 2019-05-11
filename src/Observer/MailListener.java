package Observer;

import java.util.HashSet;
import java.util.Set;

public class MailListener implements IObserver{
    public String emailAdress = null;

    @Override
    public void react(MailType mailType, Object data) {
        System.out.println(this.emailAdress + " was received your email");
    }

    public MailListener(String emailAdress) {
        this.emailAdress = emailAdress;
    }
    public void subscribe(MailType type,MailPublisher publisher){
        if (
        publisher.getObservers().containsKey(this)){
            System.out.println("you had beed subsribd already");
        }
        else {
            Set<MailListener> observers_;

            if (!publisher.getObservers().containsKey(type)){
                observers_= new HashSet<>();
                publisher.getObservers().put(type, observers_);
            }
            else {
                observers_= publisher.getObservers().get(type);
            }

            if (!publisher.getObservers().get(type).contains(this)){
            observers_.add(this);
            System.out.println(this.emailAdress + " want to reading your messages");
            }
            else {
                System.out.println("you already subscribing on");
            }
        }

        }

    }

