package br.com.caelum.eats.distancia.mongo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestauranteMongoRepository extends MongoRepository<RestauranteMongo, Long> {
	
		
	Page<RestauranteMongo> findaAll(Pageable limit);
	
	Page<RestauranteMongo> finadAllByTipoDeCozinhaId(Long tipoDeCozinhaId, Pageable limit);
	
	
}
