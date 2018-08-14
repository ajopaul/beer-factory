package com.ajopaul.beerfactory.repositories;

import com.ajopaul.beerfactory.beer.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {
}
