package designPattern.structural.proxy;

import designPattern.structural.proxy.thirdParty.Video;
import designPattern.structural.proxy.thirdParty.YoutubeLibrary;
import designPattern.structural.proxy.thirdParty.impl.YoutubeLibraryImpl;

import java.util.HashMap;

public class YoutubeCacheProxy implements YoutubeLibrary {
    private YoutubeLibrary youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();


    public YoutubeCacheProxy() {
        this.youtubeService = new YoutubeLibraryImpl();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
