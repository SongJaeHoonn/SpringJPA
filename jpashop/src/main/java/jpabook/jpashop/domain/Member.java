package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") //mappedBy란 "나는 내가 매핑을 하는 애가 아니고 나는 저거에서 그냥 매핑된 거울일 뿐이야(읽기 전용)
    private List<Order> orders = new ArrayList<>();
}
