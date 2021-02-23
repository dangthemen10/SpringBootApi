package com.techbase.practicespringbootiapi.controller;

import com.techbase.practicespringbootiapi.dto.SpecialCouponDTO;
import com.techbase.practicespringbootiapi.entity.SpecialCoupon;
import com.techbase.practicespringbootiapi.service.SpecialCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpecialCouponController {
    @Autowired
    private SpecialCouponService specialCouponService;

    @GetMapping("/all")
    public Iterable<SpecialCoupon> specialCouponsList() {
        return specialCouponService.findAllSpecialCoupon();
    }
    @PostMapping("/create")
    public SpecialCouponDTO createSpecialCoupon(@RequestBody SpecialCouponDTO model) {
        return specialCouponService.saveSpecialCoupon(model);
    }
    @PutMapping("/edit/{id}")
    public SpecialCouponDTO editSpecialCoupon(@RequestBody SpecialCouponDTO model, @PathVariable("id") long id) {
        model.setId(id);
        return specialCouponService.saveSpecialCoupon(model);
    }
    @DeleteMapping(value = "/new")
    public void deleteSpecialCoupon(@RequestBody long ids) {
        specialCouponService.deleteSpecialCoupon(ids);
    }
}
