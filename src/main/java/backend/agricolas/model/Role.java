package backend.agricolas.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
@Data
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
    private Long id;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy = "role")
    private List<Person> personList;
}
