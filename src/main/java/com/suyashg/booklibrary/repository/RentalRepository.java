package com.suyashg.booklibrary.repository;

import com.suyashg.booklibrary.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {
}