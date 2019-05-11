package Observer;

public class ObserverDemo {

    public static void main(String[] args) {
        MailType mailType = new MailType("Message");
        MailPublisher publisher = new MailPublisher();
        MailListener observer = new MailListener("oleg@mail.ru");
        MailListener observer2 = new MailListener("masha@mgil.ru");

        publisher.subscribers(mailType, observer);
        publisher.subscribers(mailType, observer2);

        publisher.notify(mailType);

        observer2.subscribe(mailType, publisher);
        observer2.subscribe(mailType, publisher);


        publisher.subscribers(mailType, observer2);




    }
}
