package Observer;

public interface IObserver {
    void react(MailType mailType, Object data);
}
