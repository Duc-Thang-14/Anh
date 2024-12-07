package com.Ha.Anh.controller;

import com.Ha.Anh.model.Student;
import com.Ha.Anh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String adminPage() {
        return "admin"; // Trang chính dành cho Admin
    }

    @GetMapping("/manage-students")
    public String manageStudents() {
        return "manage_students"; // Quản lý thông tin sinh viên
    }

    @GetMapping("/manage-scores")
    public String manageScores() {
        return "manage_scores"; // Quản lý điểm
    }

    @GetMapping("/manage-schedule")
    public String manageSchedule() {
        return "manage_schedule"; // Quản lý thời khóa biểu
    }

    @GetMapping("/manage-ratings")
    public String manageRatings() {
        return "manage_ratings"; // Đánh giá sinh viên
    }

    @GetMapping("/manage-subjects")
    public String manageSubjects() {
        return "manage_subjects"; // Trả về trang quản lý môn học
    }

    @GetMapping("/manage-classes")
    public String manageClasses() {
        return "manage_classes"; // Trả về trang quản lý lớp học
    }


}
