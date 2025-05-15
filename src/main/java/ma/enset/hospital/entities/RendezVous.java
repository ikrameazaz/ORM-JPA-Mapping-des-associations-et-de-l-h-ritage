package ma.enset.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class RendezVous {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private StatusRDV status;
    @ManyToOne
    private Medecin medecin;
    @ManyToOne
    private Patient patient;
    @OneToOne(mappedBy = "rendezVous", fetch=FetchType.LAZY)
    private Consultation consultation;

}
