package Observer;

public interface IDataEventPublisher {

    void subscribers(MailType mailType, MailListener observer);

    void notify(MailType mailType);

    void unsubscribe(MailType mailType, MailListener observer);
}