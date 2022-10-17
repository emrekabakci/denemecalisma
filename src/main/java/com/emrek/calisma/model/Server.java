package com.emrek.calisma.model;

import com.emrek.calisma.enumeration.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String email;
    private String imgUrl;
    @Column(unique = true)
    @NotEmpty(message = "Ip Address can not be empty")
    private String ipAddress;
    private String type;
    private String memory;
    private Status status;

}
