package my.spike;

import my.spike.repository.CustomerRepository;
import my.spike.repository.PhoneNumberRepository;
import my.spike.repository.ProductRepository;
import my.spike.repository.entity.Customer;
import my.spike.repository.entity.PhoneNumber;
import my.spike.repository.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlywaySpringDataJpaApplicationTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    @Test
    @Sql(scripts = {"/clear-tables.sql", "/seed-data.sql"})
    @Transactional
    public void test_should_fetch_products_greater_than_given_approved_date() {
        final List<Product> products = productRepository.findByApprovedDateGreaterThanEqual(Date.valueOf
                (LocalDate.of(2015, 1, 1)));
        assertEquals(2, products.size());
    }

    @Test
    @Sql(scripts = {"/clear-tables.sql", "/seed-data.sql"})
    @Transactional
    public void test_should_fetch_customer_by_id() {
        final Customer customer = customerRepository.findOne(1);
        assertEquals("fname1", customer.getFirstName());
        assertEquals("lname1", customer.getLastName());
    }

    @Test
    @Sql(scripts = {"/clear-tables.sql", "/seed-data.sql"})
    @Transactional
    public void test_should_return_phone_numbers_for_given_customer() {
        final Customer customer = customerRepository.findOne(1);
        final Set<PhoneNumber> phoneNumbers = customer.getPhoneNumbers();
        assertEquals(1, phoneNumbers.size());
        assertEquals("12312312", phoneNumbers.stream().toArray(PhoneNumber[]::new)[0].getPhoneNumber());
    }

    @Test
    @Sql(scripts = {"/clear-tables.sql", "/seed-data.sql"})
    @Transactional
    public void test_should_return_phone_number_given_id() {
        final PhoneNumber phoneNumber = phoneNumberRepository.findOne(1);
        assertEquals("12312312", phoneNumber.getPhoneNumber());
    }


}
