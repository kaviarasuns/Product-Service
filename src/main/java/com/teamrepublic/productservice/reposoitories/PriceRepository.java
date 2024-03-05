package com.teamrepublic.productservice.reposoitories;

import com.teamrepublic.productservice.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository
extends JpaRepository<Price, Long> {

}
