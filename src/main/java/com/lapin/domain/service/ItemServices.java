package com.lapin.domain.service;

import com.lapin.domain.entity.Item;
import com.lapin.domain.repository.ItemRepository;
import com.lapin.util.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by lapin on 2017. 3. 11..
 */
@Service
public class ItemServices {

    @Autowired
    private ItemRepository itemRepository;

    public Item save(Item item) {
        return itemRepository.save(item);
    }

    public Item find(Long itemId) {
        return itemRepository.findOne(itemId);
    }

    public Item update(Item itemForUpdate) {
        Item item = itemRepository.findOne(itemForUpdate.getItemId());
        if (StringUtils.hasText(itemForUpdate.getName())) {
            item.setName(itemForUpdate.getName());
        }
        if (NumberUtils.isNatureNumber(itemForUpdate.getPrice())) {
            item.setPrice(itemForUpdate.getPrice());
        }
        if (NumberUtils.isNatureNumber(itemForUpdate.getStockQuantity())) {
            item.setStockQuantity(itemForUpdate.getStockQuantity());
        }
        return itemRepository.save(item);
    }

    public void remove(Long itemId) {
        itemRepository.delete(itemId);
    }
}
