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
public class PublishingHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer publishing_house_id;

    @NotNull
    private String name;

    public Integer getPublishing_house_id() {
        return publishing_house_id;
    }

    public void setPublishing_house_id(Integer id) {
        this.publishing_house_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
