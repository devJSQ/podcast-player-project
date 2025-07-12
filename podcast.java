import java.util.Stack;
class Podcast {
    private String name;
    private String channel;
    private String speaker;
    private String guests;
    private double duration;

    public Podcast(String name, String channel, String speaker, String guests, double duration) {
        this.name = name;
        this.channel = channel;
        this.speaker = speaker;
        this.guests = guests;
        this.duration = duration;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Podcast:" + name + ", Channel:" + channel + ", Speaker:" + speaker +
                ", Guests;" + guests + ", Duration:" + duration + "mins";
    }
}

public class PodcastPlayer {
    private static final int MAX_SIZE = 10;
    private Stack<Podcast> playbackHistory = new Stack<>();

    public void add(Podcast podcast) {
        if (playbackHistory.size() < MAX_SIZE) {
            playbackHistory.push(podcast);
            System.out.println("added: " + podcast.getName());
        } else {
            System.out.println("playback history is full!");
        }
    }

    public void play() {
        if (!playbackHistory.isEmpty()) {
            System.out.println("Now playing: " + playbackHistory.peek());
        } else {
            System.out.println("No podcast to play.");
        }
    }

    public void previous() {
        if (playbackHistory.size() > 1) {
            playbackHistory.pop();
            System.out.println("<-- returning to previous podcast <--");
            play();
        } else {
            System.out.println("cannot go back, no previous podcast :(");
        }
    }

    public void printAll() {
        if (playbackHistory.isEmpty()) {
            System.out.println("Playback history is empty!");
            return;
        }

        System.out.println("\n--- playback history ---");
        for (int i = playbackHistory.size() - 1; i >= 0; i--) {
            System.out.println((playbackHistory.size() - i) + ". " + playbackHistory.get(i).getName());
        }
    }

    public static void main(String[] args) {
        PodcastPlayer player = new PodcastPlayer();

        // here ill add 10 podcasts
        for (int i = 1; i <= 10; i++) {
            player.add(new Podcast("Episode " + i, "Channel " + i, "Speaker " + i, "Guest " + i, 30 + i));
        }

        player.printAll();

        // here ill play the latest podcast
        System.out.println("\n> Playing most recent podcast:");
        player.play();

        // go back to previous
        System.out.println("\n> Going to previous podcast:");
        player.previous();

        player.printAll();
    }
}
