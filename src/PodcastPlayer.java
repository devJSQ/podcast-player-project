

public class PodcastPlayer {
    public static void main(String[] args) {
        PodcastStack playbackHistory = new PodcastStack();

        // Add 10 podcasts
        for (int i = 1; i <= 10; i++) {
            playbackHistory.add(new Podcast(
                "Episode " + i,
                "Channel " + i,
                "Speaker " + i,
                "Guest " + i,
                30 + i
            ));
        }

        playbackHistory.printAll();
        System.out.println("\n> Playing most recent podcast:");
        playbackHistory.play();
        System.out.println("\n> Going to previous podcast:");
        playbackHistory.previous();
        playbackHistory.printAll();
    }
}
