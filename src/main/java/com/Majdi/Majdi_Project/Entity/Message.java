package com.Majdi.Majdi_Project.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.AutoConfiguration;


@Entity

@Data
@AutoConfiguration
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;


}
