package com.codewithahmed.springjpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codewithahmed.springjpa.model.Player;
import com.codewithahmed.springjpa.repo.PlayerRepository;

@SpringBootTest
class SpringjpaApplicationTests {

    @Autowired
    private PlayerRepository repository;

    @Test
    public void testSavePlayer() {
        Player player = new Player();
        player.setId(11l);
        player.setName("Ahmed");
        player.setScore(2);
        repository.save(player);

        Player savedPlayer = repository.findById(11l).get(); // fixed: Player not PLayer

        assertNotNull(savedPlayer);
    }
}