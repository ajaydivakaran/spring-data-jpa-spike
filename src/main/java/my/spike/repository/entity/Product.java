package my.spike.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "approved_date")
    private Date approvedDate;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;
}
