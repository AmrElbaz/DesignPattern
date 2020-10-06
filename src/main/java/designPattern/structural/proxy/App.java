package designPattern.structural.proxy;

import designPattern.structural.proxy.thirdParty.impl.YoutubeLibraryImpl;

public class App {
        /*
        *
        *
        *                                       Proxy Design Pattern
        *
        * A proxy controls access to the original object,
        *   allowing you to perform something either before or after the request gets through to the original object.
        *
        *
        *
        * */
    public static void main(String[] args) {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new YoutubeLibraryImpl());

        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
