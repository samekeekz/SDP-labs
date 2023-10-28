package fourthAssignment;

public class User implements Observer{
    private String firstName;

    public User(String firstName, Subject subject) {
        this.firstName = firstName;
        subject.addUser(this);
    }

    @Override
    public void update(String message) {
        System.out.println(this.firstName + " received the notification: " + message);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
