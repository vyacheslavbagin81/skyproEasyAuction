package ru.skypro.coursework.web_development.easyauction.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateLot {
    private String title;
    private String description;
    private Integer startPrice;
    private Integer bidPrice;
}
