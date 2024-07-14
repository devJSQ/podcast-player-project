# Podcast Player Project

### Objective
Using fundamental data structures and algorithms, solve real-world problems with a stack.

### Problem
A software development company plans to develop a podcast player system that allows users to listen to podcasts and manage playlists, your responsibility is to build a playlist tracking feature, enabling the user to keep track of their podcast playlist and navigate through it by playing new episodes or returning to previous ones.  
 
### Implementation
- Create a `playbackHistory` stack that can accommodate 10 podcasts. Each podcast should include a name, channel, speaker, guests, and duration.
- Write a function `add()` to add a new podcast to the `playbackHistory` list and print a message indicating the addition.
- Write a function `play()` to retrieve the current playing podcast info and print a message indicating that the podcast is being played. If the `playbackHistory` list is not empty.
- Write a function `previous()`  to play the previous podcast in the playback history if the `playbackHistory` list is not empty, or it contains only one podcast. Otherwise, print a message indicating that going back is impossible. 
- Write a function `printALL()` to print all podcast names in the `playbackHistory`.
- In the main method:
  - Add 10 podcasts to the playback history.
  - Print the initial playback history.
  - Play the most recently added podcast.
  - Go back to the previous podcast.
  - Print the updated playback history.


``` java
public class PodcastPlayer {
    public static void main(String[] args) {
      /* add your code here */
    }

}
```
### Qualification to pass
- [ ] The code should run successfully.
- [ ] Write all required functions correctly.
- [ ] Completely define the Podcast class.
- [ ] Completely define  PodcastPlayer class.
