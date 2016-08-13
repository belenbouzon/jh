package com.belen.colorima.repository;

import com.belen.colorima.domain.Gama;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Gama entity.
 */
@SuppressWarnings("unused")
public interface GamaRepository extends JpaRepository<Gama,Long> {

}
