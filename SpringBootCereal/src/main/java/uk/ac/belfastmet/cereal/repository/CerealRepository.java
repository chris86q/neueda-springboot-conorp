package uk.ac.belfastmet.cereal.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.cereal.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer> {}