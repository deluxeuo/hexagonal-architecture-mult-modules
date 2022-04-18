package br.com.realstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.realstate.entity.RealState;

@Repository
public interface RealStateRepository extends JpaRepository<RealState, Long> {

}
