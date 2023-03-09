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
@Table(name = "buyer")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buyer_id")
    private Integer buyer_id;

    @NotNull
    @Column(name = "first_name")
    private String first_name;

    @NotNull
    @Column(name = "second_name")
    private String second_name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;
}
