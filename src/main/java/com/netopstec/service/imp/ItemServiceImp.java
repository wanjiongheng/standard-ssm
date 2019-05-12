package com.netopstec.service.imp;

import com.netopstec.dao.ItemMapper;
import com.netopstec.domain.Item;
import com.netopstec.service.ItemService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class ItemServiceImp implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public Item getById(Long id) {
        log.info("start ==> itemServiceImp --> getById : Long " + id);
        if (id == null) {
            return null;
        }
        return itemMapper.findById(id);
    }
}
