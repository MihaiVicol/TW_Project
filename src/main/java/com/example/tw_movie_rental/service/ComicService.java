package com.example.tw_movie_rental.service;

import com.example.tw_movie_rental.Model.Comic;
import com.example.tw_movie_rental.response.ComicResponse;
import org.springframework.http.ResponseEntity;

import javax.xml.ws.Response;
import java.util.List;

public interface ComicService {
    public ResponseEntity<ComicResponse> getComics();
}
