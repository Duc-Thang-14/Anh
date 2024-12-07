package com.Ha.Anh.service;

import com.Ha.Anh.model.Score;
import com.Ha.Anh.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository; // Tiêm dependency của ScoreRepository

    // Phương thức để lấy tất cả điểm thi
    public List<Score> getAllScores() {
        return scoreRepository.findAll(); // Gọi phương thức từ ScoreRepository
    }

    // Phương thức lấy danh sách điểm thi theo mã sinh viên
    public List<Score> getScoresByStudentId(Long studentId) {
        return scoreRepository.findByStudent_StudentId(studentId); // Query với studentId
    }

    // Phương thức thêm hoặc cập nhật điểm thi
    public void saveScore(Score score) {
        scoreRepository.save(score);
    }

    // Phương thức xóa điểm thi
    public void deleteScore(Long scoreId) {
        scoreRepository.deleteById(scoreId);
    }
}
