package com.techbase.practicespringbootiapi.converter;

import com.techbase.practicespringbootiapi.dto.SpecialCouponDTO;
import com.techbase.practicespringbootiapi.entity.SpecialCoupon;
import org.springframework.stereotype.Component;

@Component
public class SpecialCouponConverter {
    public SpecialCoupon toSpecialCouponEntity(SpecialCouponDTO specialCouponDTO) {
        SpecialCoupon specialCouponEntity = new SpecialCoupon();
        specialCouponEntity.setName(specialCouponDTO.getName());
        specialCouponEntity.setStatus(specialCouponDTO.getStatus());
        specialCouponEntity.setPrice(specialCouponDTO.getPrice());
        specialCouponEntity.setCount(specialCouponDTO.getCount());
        specialCouponEntity.setStartDate(specialCouponDTO.getStartDate());
        specialCouponEntity.setEndDate(specialCouponDTO.getEndDate());
        specialCouponEntity.setType(specialCouponDTO.getType());
        return specialCouponEntity;
    }
    public SpecialCouponDTO toSpecialCouponDTO(SpecialCoupon specialCouponEntity) {
        SpecialCouponDTO specialCouponDTO = new SpecialCouponDTO();
        if (specialCouponEntity.getId() != null) {
            specialCouponDTO.setId(specialCouponEntity.getId());
        }
        specialCouponDTO.setName(specialCouponEntity.getName());
        specialCouponDTO.setStatus(specialCouponEntity.getStatus());
        specialCouponDTO.setPrice(specialCouponEntity.getPrice());
        specialCouponDTO.setCount(specialCouponEntity.getCount());
        specialCouponDTO.setStartDate(specialCouponEntity.getStartDate());
        specialCouponDTO.setEndDate(specialCouponEntity.getEndDate());
        specialCouponDTO.setType(specialCouponEntity.getType());
        return specialCouponDTO;
    }
    public SpecialCoupon toSpecialCoupon(SpecialCouponDTO specialCouponDTO, SpecialCoupon specialCouponEntity) {
        specialCouponEntity.setName(specialCouponDTO.getName());
        specialCouponEntity.setStatus(specialCouponDTO.getStatus());
        specialCouponEntity.setPrice(specialCouponDTO.getPrice());
        specialCouponEntity.setCount(specialCouponDTO.getCount());
        specialCouponEntity.setStartDate(specialCouponDTO.getStartDate());
        specialCouponEntity.setEndDate(specialCouponDTO.getEndDate());
        specialCouponEntity.setType(specialCouponDTO.getType());
        return specialCouponEntity;
    }
}
