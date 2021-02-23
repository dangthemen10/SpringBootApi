package com.techbase.practicespringbootiapi.service;

import com.techbase.practicespringbootiapi.dto.SpecialCouponDTO;
import com.techbase.practicespringbootiapi.entity.SpecialCoupon;

import java.util.List;

public interface SpecialCouponService{
    SpecialCouponDTO saveSpecialCoupon(SpecialCouponDTO specialCouponDTO);
    Iterable<SpecialCoupon> findAllSpecialCoupon();
    void deleteSpecialCoupon(long id);

    List<SpecialCoupon> searchSpecialCoupon(String name);

    SpecialCoupon findOneSpecialCoupon(long id);
}
