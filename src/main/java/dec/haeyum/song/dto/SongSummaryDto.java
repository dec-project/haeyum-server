package dec.haeyum.song.dto;

import dec.haeyum.song.entity.Song;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Builder
public class SongSummaryDto {
    private Long songId;
    private String title;
    private List<String> artists;
    private int ranking;
    private String songImg;

    public static SongSummaryDto toDto(Song song, int ranking) {
        return SongSummaryDto.builder()
                .songId(song.getSongId())
                .title(song.getTitle())
                .artists(song.getArtists())
                .ranking(ranking)
                .songImg(song.getSongImg())
                .build();
    }
}