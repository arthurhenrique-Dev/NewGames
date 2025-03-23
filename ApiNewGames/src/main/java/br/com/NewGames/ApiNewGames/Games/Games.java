package br.com.NewGames.ApiNewGames.Games;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Entity(name = "game")
@Table(name = "games_storage")
@AllArgsConstructor
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Games {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String unit;
    private String price;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    public Games(DataGames data) {
        this.name = data.name();
        this.unit = data.unit();
        this.price = data.price();
        this.genre = data.genre();
    }

    public void putGames(@Valid DataPutGames dataGames) {
        this.price = dataGames.price();
        this.unit = dataGames.unit();
    }
}
