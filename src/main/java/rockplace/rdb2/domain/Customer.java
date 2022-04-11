package rockplace.rdb2.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Customer {

    @GeneratedValue
    @Id
    @Column(name = "customer_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "engineer_id")
    private Engineer engineer;

    private String name;
    private String manager;
    private String phone;
    private String mail;


}
