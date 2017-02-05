package my.spike;

import my.spike.repository.CustomerRepository;
import my.spike.repository.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlywaySpringDataJpaApplicationTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    @Sql(scripts = {"/clear-tables.sql", "/seed-data.sql"})
    public void test_should_fetch_customer_by_id() {
        final Customer customer = customerRepository.findOne(1);
        assertEquals("fname1", customer.getFirstName());
        assertEquals("lname1", customer.getLastName());
    }

}
