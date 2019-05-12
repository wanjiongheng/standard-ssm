package com.netopstec.controller;

import com.netopstec.domain.Item;
import com.netopstec.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {


    @Autowired
    private ItemService itemService;

    @RequestMapping("/{id}")
    public Item getById(@PathVariable("id") Long id) {
        return itemService.getById(id);
    }
}
