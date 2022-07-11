package lv.alija.demospringdata.springdatajpa.repository;

import lv.alija.demospringdata.springdatajpa.entity.Student;
import lv.alija.demospringdata.springdatajpa.entity.TrainingDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<TrainingDAO, Long> {
}
