package fourthAssignment;

import java.util.ArrayList;
import java.util.List;

public class TvShow {
    private String showName;
    private List<String> episodes = new ArrayList<>();

    public TvShow(String showName) {
        this.showName = showName;
    }

    public void addNewEpisode(String episodeName, TelegramBot bot){
        episodes.add(episodeName);
        bot.newEpisodeAvailable(this);
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public List<String> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<String> episodes) {
        this.episodes = episodes;
    }
}
