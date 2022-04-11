package rockplace.rdb2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rockplace.rdb2.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
