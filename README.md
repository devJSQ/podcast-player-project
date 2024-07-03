# Podcast Player Project

### Objective
Using fundamental data structures and algorithms, solve real-world problems with a stack.

### Problem
A software development company wants to build a `PodcastPlayer` system to keep track of the user's playback history. The system allows to perform various operations such as **add()**, **play()** , **go_back()**, **printList()**.

> Each podcast has a name, channel, speaker, guests, and duration.  
 
  

### Implementation
- Create a `playbackHistory` stack that can accommodate 10 podcasts.
- Write a function `add()` to add a new podcast to the playbackHistory list and print a message indicating the addition.
- Write a function `play()` to retrieve the last added podcast from the list and print a message indicating that the podcast is being played. If the playbackHistory list is not empty.
- Write a function `go_back()`  to play the previous podcast in the playback history if the playbackHistory list is not empty or it contains only one podcast. Otherwise, print a message indicating that it's not possible to go back. 
- Write a function `printList()` to print all podcast names in the playbackHistory.
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
