package com.codewithahmed.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithahmed.springjpa.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
