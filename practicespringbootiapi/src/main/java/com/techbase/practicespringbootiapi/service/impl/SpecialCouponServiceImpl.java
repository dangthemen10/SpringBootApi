package com.techbase.practicespringbootiapi.service.impl;

import com.techbase.practicespringbootiapi.converter.SpecialCouponConverter;
import com.techbase.practicespringbootiapi.dto.SpecialCouponDTO;
import com.techbase.practicespringbootiapi.entity.SpecialCoupon;
import com.techbase.practicespringbootiapi.repository.SpecialCouponRepository;
import com.techbase.practicespringbootiapi.service.SpecialCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialCouponServiceImpl implements SpecialCouponService {
    @Autowired
    private SpecialCouponRepository specialCouponRepository;

    @Autowired
    private SpecialCouponConverter specialCouponConverter;

    @Override
    public SpecialCouponDTO saveSpecialCoupon(SpecialCouponDTO specialCouponDTO) {
        SpecialCoupon specialCoupon = new SpecialCoupon();
        if (specialCouponDTO.getId() != null) {
            SpecialCoupon oldSpecialCoupon = specialCouponRepository.getOne(specialCouponDTO.getId());
            specialCoupon = specialCouponConverter.toSpecialCoupon(specialCouponDTO, oldSpecialCoupon);
        } else {
            specialCoupon = specialCouponConverter.toSpecialCouponEntity(specialCouponDTO);
        }
        specialCoupon = specialCouponRepository.save(specialCoupon);
        return specialCouponConverter.toSpecialCouponDTO(specialCoupon);
    }

    @Override
    public Iterable<SpecialCoupon> findAllSpecialCoupon() {
        return specialCouponRepository.findAll();
    }

    @Override
    public List<SpecialCoupon> searchSpecialCoupon(String name) {
        return specialCouponRepository.findByNameContaining(name);
    }

    @Override
    public SpecialCoupon findOneSpecialCoupon(long id) {
        return specialCouponRepository.getOne(id);
    }

    @Override
    public void deleteSpecialCoupon(long id) {
        specialCouponRepository.deleteById(id);
    }
}
