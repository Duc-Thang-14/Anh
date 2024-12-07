package com.Ha.Anh.controller;

import com.Ha.Anh.model.ClassSchedule;
import com.Ha.Anh.model.Score;
import com.Ha.Anh.model.Student;
import com.Ha.Anh.service.ClassScheduleService;
import com.Ha.Anh.service.ScoreService;
import com.Ha.Anh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String studentPage() {
        return "student"; // Trang chính dành cho Student
    }

    @GetMapping("/view-info")
    public String viewInfo(Model model) {
        List<Student> students = studentService.getAllStudents(); // Lấy danh sách sinh viên từ service
        model.addAttribute("students", students); // Truyền danh sách vào model
        return "student_info"; // Chuyển đến trang student_info để hiển thị thông tin
    }

    @Autowired
    private ScoreService scoreService; // Sử dụng ScoreService thay vì scoreRepository

    @GetMapping("/view-scores")
    public String viewScores(Model model) {
        List<Score> scores = scoreService.getAllScores(); // Lấy danh sách điểm thi từ ScoreService
        model.addAttribute("scores", scores); // Đưa danh sách điểm thi vào Model
        return "student_scores"; // Trả về tên file template để hiển thị
    }

    @Autowired
    private ClassScheduleService classScheduleService;

    @GetMapping("/view-schedule")
    public String viewSchedule(Model model) {
        // Lấy tất cả thời khóa biểu
        List<ClassSchedule> schedules = classScheduleService.getAllSchedules();
        model.addAttribute("schedules", schedules);
        return "class_schedule"; // Tên của file HTML/JSP
    }
}
