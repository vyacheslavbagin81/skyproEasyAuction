package ru.skypro.coursework.web_development.easyauction.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.skypro.coursework.web_development.easyauction.pojo.StatusLot;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lot {
    private StatusLot status;
    private String title;
    private String description;
    private Integer startPrice;
    private Integer bidPrice;
}
