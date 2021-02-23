package com.techbase.practicespringbootiapi.repository;

import com.techbase.practicespringbootiapi.entity.StaticCoupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StaticCouponRepository extends JpaRepository<StaticCoupon, Long> {
}
