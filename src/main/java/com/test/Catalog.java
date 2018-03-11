package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {

    private int id;

    private final String PATHTOCATALOGLOCATION;
    private final String PATHTOCATALOGLOCATIONFROMURL = "/static/videos/";
    private final String CATALOGNAMEPATTERN;
    private final String VIDEONAMEPATTERN;
    private final String SUFIX = ".mp4";
    private String videoPath;
    private String videoName;
    private Map<String, Object> videos;

    public Map<String, Object> getVideos() {
        return videos;
    }

    public Catalog(int id, String PATHTOCATALOGLOCATION, String CATALOGNAMEPATTERN, String VIDEONAMEPATTERN) {
        this.id = id;

        //videos' catalog path (!absolute) C:\Users\Yura\IdeaProjects\Courses\src\main\webapp\static\videos\
        this.PATHTOCATALOGLOCATION = PATHTOCATALOGLOCATION + "/";

        //catalog name pattern "videocatalog" + id + "/"
        this.CATALOGNAMEPATTERN = CATALOGNAMEPATTERN + id + "/";

        //video name pattern "movie"
        this.VIDEONAMEPATTERN = VIDEONAMEPATTERN;

        fillVideos();
    }

    private void fillVideos() {
        int i;
        List<String> videosList = new ArrayList<String>();
        for(i = 0; checkVideoExistence(i); i++);
        videos = new HashMap<String, Object>();
        for(int j = i - 1; j >= 0; j--) {
            videoName = VIDEONAMEPATTERN + j;
            videoPath = PATHTOCATALOGLOCATIONFROMURL + CATALOGNAMEPATTERN + VIDEONAMEPATTERN + j + SUFIX;
            videosList.add(videoPath);
        }
        videos.put("videos", videosList);
    }


    private boolean checkVideoExistence(int id) {
        File movie = new File(PATHTOCATALOGLOCATION + CATALOGNAMEPATTERN + VIDEONAMEPATTERN + id + SUFIX);
        return movie.exists();
    }
}
