package br.com.NewGames.ApiNewGames.Games;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/games")
public class GamesController {

    @Autowired
    private GamesRepository gamesRepository;

    @PostMapping
    @Transactional
    public void postGames(@RequestBody @Valid DataGames dataGames){
        gamesRepository.save(new Games(dataGames));
    }

    @GetMapping
    public List<DataListGames> getAllGames(){
        return gamesRepository.findAll().stream().map(DataListGames::new).toList();
    }

    @PutMapping
    @Transactional
    public void put(@RequestBody @Valid DataPutGames dataGames){
        var games = gamesRepository.getReferenceById(dataGames.id());
        games.putGames(dataGames);
    }

    @DeleteMapping("/{id}")
    @Transactional

    public void remove(@PathVariable Long id) {
        var games = gamesRepository.getReferenceById(id);
        gamesRepository.delete(games);
    }
}
