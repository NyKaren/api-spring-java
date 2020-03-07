package com.wexapi.wex.repository;

import com.wexapi.wex.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository <Movies,Long> {

}
