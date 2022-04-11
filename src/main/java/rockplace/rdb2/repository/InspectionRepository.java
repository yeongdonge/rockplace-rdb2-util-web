package rockplace.rdb2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rockplace.rdb2.domain.Inspection;

public interface InspectionRepository extends JpaRepository<Inspection, Long> {
}
