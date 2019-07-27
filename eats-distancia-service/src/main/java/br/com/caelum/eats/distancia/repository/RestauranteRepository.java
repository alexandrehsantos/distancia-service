package br.com.caelum.eats.distancia.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caelum.eats.distancia.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long>{

	Page<Restaurante> findAllByAprovadoAndTipoDeCozinhaId(boolean aprovado, Long tipoDeCozinhaId, Pageable limit);

	List<Restaurante> findAllByAprovado(boolean b);
}
