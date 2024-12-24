package dec.haeyum.searchCalender.entity;

import dec.haeyum.member.entity.MemberEntity;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "calender")
@Getter
public class CalenderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calenderId;
    private LocalDate calenderDate;
    private String calenderName; // 2022년 10월 12일
    private String content;
    private Integer viewCount;
    @ManyToMany(mappedBy = "favorite")
    private List<MemberEntity> favorite = new ArrayList<>();

    public void createCalender(LocalDate startDate) {
        // 2001-1-2 데이터를 2001년 1월 2일 로 변환
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String format = startDate.format(formatter);
        this.calenderName = format;
        this.calenderDate = startDate;
        this.viewCount = 0;
    }
}