package br.com.NewGames.ApiNewGames.Games;

import jakarta.validation.constraints.NotNull;

public record DataPutGames(Long id,

                           @NotNull
                           String price,

                           String unit) {
}
