import java.util.Queue;

import java.util.LinkedList;

public class YouTubeVideoPlayer {

    Queue queue = new LinkedList<>();

    public void addVideo(String videoURL) {

        queue.add(videoURL);

    }

    public void playVideo() {

        if (queue.peek() != null) {

            String videoURL = queue.remove();

            // Code to play video

            System.out.println("Playing video " + videoURL);

        }

    }

}
