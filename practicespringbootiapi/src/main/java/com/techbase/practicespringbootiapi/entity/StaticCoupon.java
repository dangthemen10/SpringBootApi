package com.techbase.practicespringbootiapi.entity;

import com.techbase.practicespringbootiapi.enums.Store;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table
public class StaticCoupon{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private Integer status;
    @Column(name = "price")
    private Double price;
    @Column(name = "count")
    private Integer count;
    @Column(name = "area")
    private String area;
    @Column(name = "store")
    @Enumerated(EnumType.STRING)
    private Store store;
    @Column(name = "online")
    private Integer online;

    public StaticCoupon() {
    }

    public StaticCoupon(Long id, String name, Integer status, Double price, Integer count, String area, Store store, Integer online) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.price = price;
        this.count = count;
        this.area = area;
        this.store = store;
        this.online = online;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }
}
