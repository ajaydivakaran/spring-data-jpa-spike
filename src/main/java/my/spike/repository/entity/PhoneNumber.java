package my.spike.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "phone_numbers")
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "phone_number")
    private String phoneNumber;

//    @ManyToMany(targetEntity = Customer.class)
//    private Set<Customer> customers;
}
