package com.example.demo;

import com.example.demo.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inherit")
public class InheritController {

    private final InheritRepository inheritRepository;

    @GetMapping("/dtype")
    public List<Notice> dtype(String dtype) {
        return inheritRepository.findNoticeByDtype(dtype);
//        return inheritRepository.findAll();
    }

    @GetMapping
    public List<Notice> inherit() {
        return inheritRepository.findAll();
    }

    @GetMapping("/title")
    public List<Notice> inherit2(String title) {
        return inheritRepository.findNoticeByTitle(title);
    }

    @PostMapping("/save/R")
    public Notice saveR() {
        RecruitNotice notice = new RecruitNotice();
        notice.setTitle("공지사항");
        notice.setDtype("R");
        notice.setRecruitNumber(10);
        notice.setRecruitContent("모집합니다.");
        return inheritRepository.save(notice);
    }

    @PostMapping("/save/C")
    public Notice saveC() {
        CommentNotice notice = new CommentNotice();
        notice.setTitle("공지사항");
        notice.setDtype("C");
        notice.setCommentContent("댓글입니다.");
        return inheritRepository.save(notice);
    }

    @PostMapping("/save/Q")
    public Notice saveQ() {
        RequestNotice notice = new RequestNotice();
        notice.setTitle("공지사항");
        notice.setDtype("Q");
        notice.setRequestContent("질문입니다.");
        return inheritRepository.save(notice);
    }
}
