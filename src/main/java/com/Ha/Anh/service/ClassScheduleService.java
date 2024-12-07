package com.Ha.Anh.service;

import com.Ha.Anh.model.ClassSchedule;
import com.Ha.Anh.repository.ClassScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassScheduleService {

    @Autowired
    private ClassScheduleRepository classScheduleRepository;

    // Lấy tất cả thời khóa biểu
    public List<ClassSchedule> getAllSchedules() {
        return classScheduleRepository.findAll();
    }

    // Lấy thời khóa biểu theo ngày học
//    public List<ClassSchedule> getSchedulesByDay(String day) {
//        return classScheduleRepository.findByDay(day);
//    }
}
