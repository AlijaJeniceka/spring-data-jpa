package lv.alija.demospringdata.springdatajpa.repository;

import lv.alija.demospringdata.springdatajpa.entity.Guardian;
import lv.alija.demospringdata.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("asdad@gmail.com")
                .firstName("Alija")
                .lastName("Something")
//                .guardianName("Abaz")
//                .guardianEmail("abaz@gmail.com")
//                .guardianMobile("01234566789")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("nikhil@gmail.com")
                .name("Nikhil")
                .mobile("0987654322")
                .build();

        Student student = Student.builder()
                .firstName("Shivam")
                .emailId("shivam@gmail.com")
                .lastName("Kumar")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }
    @Test
    public void printAllStudent(){
        List<Student> studentList=
                studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students =
                studentRepository.findByFirstName("shivam");
        System.out.println("students = " + students);
    }
    @Test
    public void  printStudentByName(){
        List<Student> students =
                studentRepository.findByFirstNameContaining("sh");
        System.out.println("students = " + students);
    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students =
                studentRepository.findByGuardianName("Nikhil");
        System.out.println("student = "+ students);
    }
    @Test
    public void printGetStudentByEmailAddress() {
        Student student =
                studentRepository.getStudentByEmailAddress(
                        "shivam@gmail.com");
        System.out.println("student = " + student);
    }
    @Test
    public void printGetStudentFirstNameByEmailAddress() {
        String firstName =
                studentRepository.getStudentFirstNameByEmailAddress(
                        "shivam@gmail.com");
        System.out.println("student = " + firstName);
    }

    @Test
    public void printGetStudentByEmailAddressNative() {
        Student student =
                studentRepository.getStudentByEmailAddressNative(
                        "shivam@gmail.com");
        System.out.println("student = " + student);}

    @Test
    public void printGetStudentByEmailAddressNativeNamedParam() {
        Student student =
                studentRepository.getStudentByEmailAddressNativeNamedParam(
                        "shivam@gmail.com");
        System.out.println("student = " + student);}

    @Test
    public void updateStudentNameByEmailIdTest(){
        studentRepository.updateStudentNameByEmailId("Shabbir Dawoodi",
                "asdad@gmail.com");
    }
}