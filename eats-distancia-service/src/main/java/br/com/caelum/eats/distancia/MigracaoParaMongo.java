//package br.com.caelum.eats.distancia;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//import br.com.caelum.eats.distancia.mongo.RestauranteMongo;
//import br.com.caelum.eats.distancia.mongo.RestauranteMongoRepository;
//import br.com.caelum.eats.distancia.repository.RestauranteRepository;
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
////@AllArgsConstructor
////@Slf4j
////@Configuration
////public class MigracaoParaMongo implements CommandLineRunner {
////
////	private RestauranteRepository jpaRepo;
////	private RestauranteMongoRepository mongoRepo;
////
////	@Override
////	public void run(String... args) throws Exception {
////		log.info("Iniciando a migração de restaurantes aprovados para Mongo");
////
////		for (Restaurante restaurante : jpaRepo.findAllByAprovado(true)) {
////
////			Long id = restaurante.getId();
////			String cep = restaurante.getCep();
////			Long tipoDeCozinhaId = restaurante.getTipoDeCozinhaId();
////
////			if (!mongoRepo.existsById(id)) {
////
////				RestauranteMongo restauranteMongo = new RestauranteMongo(id, cep, tipoDeCozinhaId);
////				mongoRepo.insert(restauranteMongo);
////
////				log.info("Migrando para mongo: " + restauranteMongo);
////			}
////		}
////		log.info("Fim da migração de restaurantes aprovados");
////	}
//
////}
