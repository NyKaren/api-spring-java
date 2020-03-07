package com.wexapi.wex.repository;

import com.wexapi.wex.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Long> {

    // ToDo search @Query
}
