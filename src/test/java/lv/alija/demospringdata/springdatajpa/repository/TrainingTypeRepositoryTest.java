package lv.alija.demospringdata.springdatajpa.repository;

import lv.alija.demospringdata.springdatajpa.entity.Student;
import lv.alija.demospringdata.springdatajpa.entity.TrainingTypeDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TrainingTypeRepositoryTest  {

    @Autowired
    private TrainingTypeRepository trainingTypeRepository;

    @Test
    public void saveTrainingType(){
        TrainingTypeDAO trainingTypeDAO = TrainingTypeDAO.builder()
                .type("SheGoesTech")
                .build();

        trainingTypeRepository.save(trainingTypeDAO);

    }

    @Test
    public void printAllTypes() {
        List<TrainingTypeDAO> types =
                trainingTypeRepository.findAll();
        System.out.println("training types = " + types);
    }
}