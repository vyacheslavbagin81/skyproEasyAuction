package ru.skypro.coursework.web_development.easyauction.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import ru.skypro.coursework.web_development.easyauction.pojo.StatusLot;


@Component
@Data
@AllArgsConstructor
public class FullLot {
    private int id;
    private String title;
    private int bidPrice;
    private int startPrice;
    private String description;
    private StatusLot status;
    private int currentPrice;
    private String lastBidName;
    private String lastBidData;

}
