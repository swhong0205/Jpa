package com.lapin.domain.entity.converter;

import com.lapin.domain.entity.Item;
import com.lapin.domain.vo.ItemVO;

/**
 * Created by lapin on 2017. 3. 11..
 */
public class ItemConverter {

    public static Item toEntity(ItemVO itemVO) {
        return Item.builder()
                .name(itemVO.getName())
                .price(itemVO.getPrice())
                .stockQuantity(itemVO.getStockQuantity())
                .build();
    }

    public static ItemVO toVo(Item item) {
        return ItemVO.builder()
                .itemId(item.getItemId())
                .name(item.getName())
                .price(item.getPrice())
                .stockQuantity(item.getStockQuantity())
                .build();
    }
}
