package br.com.NewGames.ApiNewGames.Games;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataGames(

        @NotBlank
        String name,

        String unit,

        @NotBlank
        String price,

        @NotNull
        Genre genre

) {

}
