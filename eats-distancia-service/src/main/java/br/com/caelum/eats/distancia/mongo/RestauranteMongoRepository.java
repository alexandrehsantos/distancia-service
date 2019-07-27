package br.com.caelum.eats.distancia.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestauranteMongoRepository extends MongoRepository<RestauranteMongo, Long> {

}
