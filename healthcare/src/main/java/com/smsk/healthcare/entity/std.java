package com.smsk.healthcare.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class std {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private int age;
}
