package com.example.fullstackangularyoutube.Service;

import com.example.fullstackangularyoutube.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public Student saveStudent(Student student);


    public List<Student>getAllStudents ();
}
