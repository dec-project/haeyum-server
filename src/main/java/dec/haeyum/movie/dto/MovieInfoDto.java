package dec.haeyum.movie.dto;

import dec.haeyum.movie.dto.response.MovieDbKeyDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
public class MovieInfoDto {

    private String movieUuid;
    private Integer ranking;
    private LocalDate openDate;
    private String title;

    private String img;
    private String content;

    @Override
    public boolean equals(Object o) {
        if (o == null ) return false;
        MovieDbKeyDto that = (MovieDbKeyDto) o;
        if (this.getMovieUuid().equals(that.getMovieUuid())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieUuid);
    }
}
