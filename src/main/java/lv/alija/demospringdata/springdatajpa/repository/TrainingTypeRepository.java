package lv.alija.demospringdata.springdatajpa.repository;

import lv.alija.demospringdata.springdatajpa.entity.Student;
import lv.alija.demospringdata.springdatajpa.entity.TrainingTypeDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingTypeRepository extends JpaRepository<TrainingTypeDAO, Long> {
}
