package lv.alija.demospringdata.springdatajpa.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "training_type")
@Builder
public class TrainingTypeDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long trainingTypeId;

    @Column(name="type")
    private String type;

    //One to Many
    @OneToMany(mappedBy = "trainingTypeId")
    private List<TrainingDAO> trainingDAOS;

    public TrainingTypeDAO(Long trainingTypeId){
        this.trainingTypeId = trainingTypeId;
    }

}
