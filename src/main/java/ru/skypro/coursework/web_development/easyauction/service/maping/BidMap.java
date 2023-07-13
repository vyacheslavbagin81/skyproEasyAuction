package ru.skypro.coursework.web_development.easyauction.service.maping;

import ru.skypro.coursework.web_development.easyauction.dto.Bid;

public class BidMap {
    public static Bid mapToBid(ru.skypro.coursework.web_development.easyauction.pojo.BidModel bidModel){
        return Bid.builder()
                .bidderName(bidModel.getBidderName())
                .bidDate(bidModel.getBidDate())
                .build();
    }
}
