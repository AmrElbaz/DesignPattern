package designPattern.structural.proxy.thirdParty;

import java.util.HashMap;

public interface YoutubeLibrary {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
