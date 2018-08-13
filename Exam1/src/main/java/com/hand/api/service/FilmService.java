package com.hand.api.service;

import com.hand.domain.entity.Film;

public interface FilmService {


    Film findFilm(int pageNum, int pageSize);
}
