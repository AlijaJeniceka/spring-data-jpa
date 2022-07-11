package lv.alija.demospringdata.springdatajpa.repository;

import lv.alija.demospringdata.springdatajpa.entity.Course;
import lv.alija.demospringdata.springdatajpa.entity.Teacher;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course courseMAth = Course.builder()
                .title("Mathematics")
                .credit(5)
                .build();
        Course courseJava = Course.builder()
                .title("Java")
                .credit(12)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Marija")
                .lastName("Blabla")
            //    .courses(Arrays.asList(courseJava, courseMAth))
                .build();

        teacherRepository.save(teacher);

    }

}