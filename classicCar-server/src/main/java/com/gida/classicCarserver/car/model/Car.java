package com.gida.classicCarserver.car.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(schema = "classiccarschema", name = "CarDetail")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Car {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private UUID id;
     private String manufacturer;
     private String model;
     private Long year;
     private String bodyStyle;
     private int km;
     private String transmission;
     private String origin;
     private int horsepower;
     private int price;
     private int detail;
     private boolean sold;

}