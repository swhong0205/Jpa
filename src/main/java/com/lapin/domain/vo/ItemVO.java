package com.lapin.domain.vo;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by lapin on 2017. 3. 11..
 */
@Builder
@Getter
public class ItemVO {
    private Long itemId;
    private String name;
    private Integer price;
    private Integer stockQuantity;
}
