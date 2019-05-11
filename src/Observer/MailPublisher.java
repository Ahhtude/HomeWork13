package Observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MailPublisher implements IDataEventPublisher{

    private Map<MailType, Set<MailListener>> observers = new HashMap<>();

    @Override
    public void subscribers(MailType type, MailListener observer) {

        Set<MailListener> observers_;

        if (!observers.containsKey(type)){
            observers_= new HashSet<>();
            observers.put(type, observers_);
        }
        else {
            observers_= observers.get(type);
        }

        if (!observers_.contains(observer)){
        observers_.add(observer);}
        else {
            System.out.println(observer.emailAdress+ " Was already subscribing on you");
        }
    }

    @Override
    public void notify(MailType mailType) {
        if (observers.containsKey(mailType)){
            observers.get(mailType).forEach(new Consumer<MailListener>() {
                @Override
                public void accept(MailListener observer) {
                    observer.react(mailType,this);
                }
            });
        }
    }

    @Override
    public void unsubscribe(MailType mailType, MailListener observer) {
        if (observers.containsKey(mailType)){
            observers.get(mailType).remove(observer);
        }
    }

    public Map<MailType, Set<MailListener>> getObservers() {
        return observers;
    }
}
