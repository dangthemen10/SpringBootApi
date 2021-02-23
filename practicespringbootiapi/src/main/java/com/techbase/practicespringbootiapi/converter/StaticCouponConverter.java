package com.techbase.practicespringbootiapi.converter;

import com.techbase.practicespringbootiapi.dto.StaticCouponDTO;
import com.techbase.practicespringbootiapi.entity.StaticCoupon;
import org.springframework.stereotype.Component;

@Component
public class StaticCouponConverter {
    public StaticCoupon toStaticCouponEntity(StaticCouponDTO staticCouponDTO) {
        StaticCoupon staticCouponEntity = new StaticCoupon();
        staticCouponEntity.setName(staticCouponDTO.getName());
        staticCouponEntity.setStatus(staticCouponDTO.getStatus());
        staticCouponEntity.setPrice(staticCouponDTO.getPrice());
        staticCouponEntity.setCount(staticCouponDTO.getCount());
        staticCouponEntity.setArea(staticCouponDTO.getArea());
        staticCouponEntity.setStore(staticCouponDTO.getStore());
        staticCouponEntity.setOnline(staticCouponDTO.getOnline());
        return staticCouponEntity;
    }

    public StaticCouponDTO toStaticCouponDTO(StaticCoupon staticCoupon) {
        StaticCouponDTO staticCouponDTO = new StaticCouponDTO();
        if (staticCoupon.getId() != null) {
            staticCouponDTO.setId(staticCoupon.getId());
        }
        staticCouponDTO.setName(staticCoupon.getName());
        staticCouponDTO.setStatus(staticCoupon.getStatus());
        staticCouponDTO.setPrice(staticCoupon.getPrice());
        staticCouponDTO.setCount(staticCoupon.getCount());
        staticCouponDTO.setArea(staticCoupon.getArea());
        staticCouponDTO.setStore(staticCoupon.getStore());
        staticCouponDTO.setOnline(staticCoupon.getOnline());
        return staticCouponDTO;
    }

    public StaticCoupon toStaticCoupon(StaticCouponDTO staticCouponDTO, StaticCoupon staticCoupon) {
        staticCoupon.setName(staticCouponDTO.getName());
        staticCoupon.setStatus(staticCouponDTO.getStatus());
        staticCoupon.setPrice(staticCouponDTO.getPrice());
        staticCoupon.setCount(staticCouponDTO.getCount());
        staticCoupon.setArea(staticCouponDTO.getArea());
        staticCoupon.setStore(staticCouponDTO.getStore());
        staticCoupon.setOnline(staticCouponDTO.getOnline());
        return staticCoupon;
    }
}
