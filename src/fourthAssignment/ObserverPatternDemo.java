package fourthAssignment;

public class ObserverPatternDemo {
    public static void main(String[] args){
        TelegramBot SerialBot = new TelegramBot();

        User user1 = new User("Samat", SerialBot);
        User user2 = new User("Gani", SerialBot);
        User user3 = new User("Aibyn", SerialBot);

        TvShow tvShow1 = new TvShow("Game of Thrones");
        TvShow tvShow2 = new TvShow("Teen Wold");
        TvShow tvShow3 = new TvShow("Breaking Bad");

        tvShow1.addNewEpisode("Episode 1 GOT", SerialBot);
        tvShow2.addNewEpisode("Episode 1 TW", SerialBot);
        tvShow3.addNewEpisode("Episode 1 BB", SerialBot);



    }
}
