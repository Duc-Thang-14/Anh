package com.Ha.Anh.controller;

import com.Ha.Anh.model.Student;
import com.Ha.Anh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/students")
public class ThemSuaXoaController {

    @Autowired
    private StudentService studentService;

    // Lấy tất cả sinh viên và hiển thị danh sách sinh viên
    @GetMapping
    public String listStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", studentService.getAllStudents());
        model.addAttribute("newStudent", new Student());  // Thêm đối tượng student trống cho form thêm mới
        return "manage_students"; // Trả về trang manage_students
    }

    // Thêm sinh viên mới
    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student); // Lưu sinh viên mới vào cơ sở dữ liệu
        return "redirect:/admin/students"; // Quay lại trang danh sách sinh viên
    }

    // Sửa thông tin sinh viên
    @PostMapping("/edit")
    public String editStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student); // Cập nhật thông tin sinh viên vào cơ sở dữ liệu
        return "redirect:/admin/students"; // Quay lại trang danh sách sinh viên
    }

    // Xóa sinh viên
    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id); // Xóa sinh viên dựa vào ID
        return "redirect:/admin/students"; // Quay lại trang danh sách sinh viên
    }

    @GetMapping("/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        Student student = studentService.getStudentById(id); // Lấy thông tin sinh viên từ ID
        model.addAttribute("student", student);  // Thêm đối tượng sinh viên vào model để hiển thị lên form
        return "edit_student";  // Trả về form sửa sinh viên
    }
}
