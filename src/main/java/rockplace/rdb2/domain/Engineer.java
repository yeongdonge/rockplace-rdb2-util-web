package rockplace.rdb2.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import rockplace.rdb2.enums.EngineerPosition;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Engineer {

    @Id
    @GeneratedValue
    @Column(name = "engineer_id")
    private Long id;

    private String name;
    private EngineerPosition position;


}
