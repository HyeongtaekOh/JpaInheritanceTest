package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InheritRepository extends JpaRepository<Notice, Long> {

//    public List<Notice> findNoticeByDtype(String dtype);

    @Query("select n from Notice n where n.dtype = :dtype")
    public List<Notice> findNoticeByDtype(String dtype);

    @Query("select n from Notice n where n.title = :title")
    public List<Notice> findNoticeByTitle(String title);
}
