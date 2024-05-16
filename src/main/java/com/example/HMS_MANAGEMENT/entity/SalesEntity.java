package com.example.HMS_MANAGEMENT.entity;

import com.example.HMS_MANAGEMENT.constent.CutStatus;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class SalesEntity {

    @Id
    @Column(name = "salesId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 시술 id

    @Column
    private String cut; // 시술

    @Column
    private String type; // 커트종류

    @Column
    private int cost; // 가격

    @Enumerated(EnumType.STRING)
    @Column(name = "service_status")
    private CutStatus cutStatus; // 커트 분류

}