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
	
    Optional<Gama> findOneByTono(String tono);
    Optional<Gama> findOneByCliente(String cliente);

    @Query("SELECT g FROM Gama g where g.cliente like %?1")
    public Optional<List<Gama>> findByClient(String client);
    


}
