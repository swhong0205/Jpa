package com.lapin.domain.repository;

import com.lapin.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lapin on 2017. 3. 11..
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
