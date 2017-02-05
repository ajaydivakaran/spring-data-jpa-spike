package my.spike.repository;

import my.spike.repository.entity.PhoneNumber;
import org.springframework.data.repository.CrudRepository;

public interface PhoneNumberRepository extends CrudRepository<PhoneNumber, Integer> {
}
