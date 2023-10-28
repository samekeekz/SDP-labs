package fourthAssignment;

public interface Subject {
    public void addUser(Observer user);
    public void removeUser(Observer user);
    public void notifyUsers(String message);

}
