package my.spike.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "phone_numbers")
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToMany(mappedBy = "phoneNumbers", fetch = FetchType.LAZY)
    private List<Customer> customers;
}
