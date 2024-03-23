package tn.pi.proerty.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "property")
public class PropertyEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float price;
    private String description;
    private String location;
    private String title;

    @Column(name = "user_fk")
    private long user;

}
