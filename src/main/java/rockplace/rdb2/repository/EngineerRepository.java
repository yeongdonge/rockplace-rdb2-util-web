package rockplace.rdb2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rockplace.rdb2.domain.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer, Long> {
}
