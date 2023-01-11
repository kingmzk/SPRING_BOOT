package com.zakria.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zakria.demo.model.Alien;


@RepositoryRestResource(collectionResourceRel = "aliens", path="aliens")
public interface AlienRepository extends JpaRepository<Alien, Integer>
{

}
