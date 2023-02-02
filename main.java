import java.util.ArrayList;

import java.util.Queue;

import java.util.LinkedList;

public class YouTubeVideoPlayer {

    public static void main(String[] args) {

        // Create a queue of videos to be played

        Queue videoQueue = new LinkedList<>();

        videoQueue.add("Video 1");

        videoQueue.add("Video 2");

        videoQueue.add("Video 3");

        videoQueue.add("Video 4");

        videoQueue.add("Video 5");

        // Create a blacklist of videos to be blocked

        ArrayList videoBlacklist = new ArrayList<>();

        videoBlacklist.add("Video 3");

        videoBlacklist.add("Video 5");

        // Play the next video in the queue

        String videoToPlay = videoQueue.poll();

        // Check if the video is on the blacklist

        if (!videoBlacklist.contains(videoToPlay)) {

            // Play the video

            System.out.println("Now playing: " + videoToPlay);

        } else {

            // Skip the video

            System.out.println("Skipping: " + videoToPlay);

        }

    }

}
