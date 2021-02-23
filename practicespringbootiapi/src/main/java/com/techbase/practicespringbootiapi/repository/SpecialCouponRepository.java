package com.techbase.practicespringbootiapi.repository;

import com.techbase.practicespringbootiapi.entity.SpecialCoupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SpecialCouponRepository extends JpaRepository<SpecialCoupon, Long> {
    List<SpecialCoupon> findByNameContaining(String name);
}
