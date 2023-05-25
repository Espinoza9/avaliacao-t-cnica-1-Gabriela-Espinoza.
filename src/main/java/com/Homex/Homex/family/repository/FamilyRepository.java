package com.Homex.Homex.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Homex.Homex.family.models.Family;


@Repository
public interface FamilyRepository extends JpaRepository<Family, Long> {
}
