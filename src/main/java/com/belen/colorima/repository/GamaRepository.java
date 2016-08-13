package com.belen.colorima.repository;

import com.belen.colorima.domain.Gama;
import com.belen.colorima.domain.User;

import org.springframework.data.jpa.repository.*;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the Gama entity.
 */
@SuppressWarnings("unused")
public interface GamaRepository extends JpaRepository<Gama,Long> {
	
    Optional<User> findOneByTono(String tono);
    Optional<User> findOneByCliente(String cliente);

    
    


}
