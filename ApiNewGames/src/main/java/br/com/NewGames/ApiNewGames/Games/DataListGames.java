package br.com.NewGames.ApiNewGames.Games;

public record DataListGames(Long id, String name, String price, Genre genre) {

    public DataListGames(Games games) {
        this(games.getId(), games.getName(), games.getPrice(), games.getGenre());
    }
}
