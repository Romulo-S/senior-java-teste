package com.senior.api.db.repository;

import com.senior.api.db.pojo.City;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
public interface CityRepository extends MongoRepository<City, ObjectId> {

    @RestResource(path = "find_by_id_opec", rel = "find_by_id_opec")
    City findByIbgeId(@Param("id_ibge") int ibgeId);

    @RestResource(path = "find_by_capital_asc", rel = "find_by_capital_asc")
    List<City> findAllByOrderByCapitalAsc(@Param("capital") String capital);
}
