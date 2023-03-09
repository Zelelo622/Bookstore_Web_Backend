package ru.vcu.cs.bookStore.data.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "publishing_house")
public class PublishingHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publishing_house_id")
    private Integer publishing_house_id;

    @NotNull
    @Column(name = "name")
    private String name;
}
