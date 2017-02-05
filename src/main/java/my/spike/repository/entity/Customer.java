package my.spike.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String firstName;

    private String lastName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "customer_phone_numbers",
            joinColumns = {@JoinColumn(name = "customer_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "phone_number_id", referencedColumnName = "id")}
    )
    private List<PhoneNumber> phoneNumbers;
}

