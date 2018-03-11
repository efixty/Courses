package com.test.controllers;

import com.test.Catalog;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.Map;

@Controller
public class CatalogController {

    @RequestMapping("/catalog")
    public String goToCatalog() {
        return "catalog";
    }

    @RequestMapping(value = "/getCatalog/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Map<String, Object> getCatalog(@PathVariable int id) {
        Catalog catalog = new Catalog(id, "/home/efixty/IdeaProjects/Courses/src/main/webapp/static/videos", "videocatalog", "movie");

        return catalog.getVideos();
    }
}
