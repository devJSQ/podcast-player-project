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
        return "Podcast:" + name + ", Channel:" + channel + ", speaker: " + speaker +
                ", Guests: " + guests + ", Duration: " + duration + " mins";
    }
}

class PodcastStack {
    private final int MAX_SIZE = 10;
    private Podcast[] stack = new Podcast[MAX_SIZE];
    private int top = -1;

    public void add(Podcast podcast) {
        if (top < MAX_SIZE - 1) {
            stack[++top] = podcast;
            System.out.println("Added: " + podcast.getName());
        } else {
            System.out.println("Playback history is full!");
        }
    }

    public void play() {
        if (top >= 0) {
            System.out.println("Now playing: " + stack[top]);
        } else {
            System.out.println("No podcast to play.");
        }
    }

    public void previous() {
        if (top > 0) {
            top--; // Go back to previous
            System.out.println("<-- Returning to previous podcast <--");
            play();
        } else {
            System.out.println("Cannot go back, no previous podcast :(");
        }
    }

    public void printAll() {
        if (top == -1) {
            System.out.println("Playback history is empty!");
            return;
        }

        System.out.println("\n--- Playback History ---");
        for (int i = top; i >= 0; i--) {
            System.out.println((top - i + 1) + ". " + stack[i].getName());
        }
    }
}

