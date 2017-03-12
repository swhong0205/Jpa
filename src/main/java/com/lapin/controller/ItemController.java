package com.lapin.controller;

import com.lapin.domain.entity.Item;
import com.lapin.domain.service.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lapin on 2017. 3. 12..
 */
@RestController
public class ItemController {
    @Autowired
    private ItemServices itemServices;

    @RequestMapping("/saveItem")
    public Item saveItem(@RequestParam(name = "itemName") String itemName) {
        Item itemVo = Item.builder().name(itemName).price(1000).stockQuantity(10).build();
        return itemServices.save(itemVo);
    }

    @RequestMapping("/findItem")
    public Item findItem(@RequestParam(name = "itemId") Long itemId) {
        return itemServices.find(itemId);
    }

    @RequestMapping("/modifyItem")
    public Item modifyItem(
            @RequestParam(name = "itemId", required = true) Long itemId,
            @RequestParam(name = "price", required = false) Integer price,
            @RequestParam(name = "stockQuantity", required = false) Integer stockQuantity) {
        Item item = Item.builder().itemId(itemId).price(price).stockQuantity(stockQuantity).build();
        return itemServices.update(item);
    }

    @RequestMapping("/removeItem")
    public boolean removeItem(@RequestParam(name = "itemId") Long itemId) {
        itemServices.remove(itemId);
        return true;
    }
}
