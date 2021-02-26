package com.Farmer.FarmerAPI.Gradle.data;

import com.Farmer.FarmerAPI.Gradle.models.Farms;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface RestRepository extends CrudRepository<Farms, Long> {


}
