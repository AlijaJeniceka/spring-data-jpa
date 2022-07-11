package lv.alija.demospringdata.springdatajpa.repository;

import lv.alija.demospringdata.springdatajpa.entity.Course;
import lv.alija.demospringdata.springdatajpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;


    @Test
    public void saveCourseMaterial(){

        Course course = Course.builder()
                .title(".net")
                .credit(6)
                .build();

        CourseMaterial courseMaterial =
                CourseMaterial.builder()
                        .URL("www.daily.com")
                        .course(course)
                        .build();
        repository.save(courseMaterial);
    }

    @Test
    public void printAllCoursesMaterials(){
        List<CourseMaterial> courseMaterial =
                repository.findAll();
        System.out.println("courseMaterials = " +courseMaterial);
    }
}