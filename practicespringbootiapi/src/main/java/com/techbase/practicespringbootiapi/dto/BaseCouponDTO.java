package com.techbase.practicespringbootiapi.dto;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
public abstract class BaseCouponDTO {
    private Long id;
    private String name;
    private Integer status;
    private Double price;
    private Integer count;
}
