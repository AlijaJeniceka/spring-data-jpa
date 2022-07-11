package lv.alija.demospringdata.springdatajpa.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "training")
@Builder
public class TrainingDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "training_type_id")
    private TrainingTypeDAO trainingTypeId;

    @Column(name="name")
    private String name;

    @Column(name="start_date")
    private LocalDateTime startDate;

    @Column(name="end_date")
    private LocalDateTime endDate;

    public TrainingDAO (Long trainingId) {
        this.id =trainingId;
    }

//    referencedColumnName = "trainingTypeId")
//    private List<TrainingType> trainingTypes;

}
