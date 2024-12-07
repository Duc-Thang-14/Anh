package com.Ha.Anh.repository;

import com.Ha.Anh.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Long> {
    List<Score> findByStudent_StudentId(Long studentId);
}
