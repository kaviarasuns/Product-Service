package com.teamrepublic.productservice.reposoitories;

import com.teamrepublic.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CategoryRepository
extends JpaRepository<Category, UUID> {

    Optional<Category> findByUuid(UUID uuid);

}
