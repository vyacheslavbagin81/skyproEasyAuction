package ru.skypro.coursework.web_development.easyauction.service.maping;

import ru.skypro.coursework.web_development.easyauction.dto.CreateLot;
import ru.skypro.coursework.web_development.easyauction.dto.Lot;
import ru.skypro.coursework.web_development.easyauction.pojo.LotModel;
import ru.skypro.coursework.web_development.easyauction.pojo.StatusLot;

public class LotMap {
    public static LotModel mapToLotModel(CreateLot lot) {
        return LotModel.builder()
                .title(lot.getTitle())
                .status(StatusLot.CREATED)
                .description(lot.getDescription())
                .startPrice(lot.getStartPrice())
                .bidPrice(lot.getBidPrice())
                .build();
    }

    public static Lot mapToLot(LotModel lotModel) {
        return Lot.builder()
                .title(lotModel.getTitle())
                .status(lotModel.getStatus())
                .description(lotModel.getDescription())
                .startPrice(lotModel.getStartPrice())
                .bidPrice(lotModel.getBidPrice())
                .build();
    }
}
