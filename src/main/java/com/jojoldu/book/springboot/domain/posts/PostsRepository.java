package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<com.jojoldu.book.springboot.domain.posts.Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<com.jojoldu.book.springboot.domain.posts.Posts> findAllDesc();


}
