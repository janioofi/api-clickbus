package com.jan1ooo.apiclickbus.domain.repositories;

import com.jan1ooo.apiclickbus.domain.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlaceRepository extends JpaRepository<Place, UUID> {
}