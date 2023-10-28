package fourthAssignment;

import java.util.ArrayList;
import java.util.List;

public class TelegramBot implements Subject{

    private List<Observer> users = new ArrayList<>();
    private List<TvShow> serials = new ArrayList<>();


    public void addTvShow(TvShow serial){
        serials.add(serial);
    }
    @Override
    public void addUser(Observer user) {
        users.add(user);
    }

    @Override
    public void removeUser(Observer user) {
        users.remove(user);
    }

    @Override
    public void notifyUsers(String message) {
        for (Observer user : users) {
            user.update(message);
        }
    }

    public void newEpisodeAvailable(TvShow tvShow) {
        // Notify all observers
        notifyUsers("The " + tvShow.getEpisodes().size() + " episode of " + tvShow.getShowName() + " is Available");
    }
}
