package ru.skypro.coursework.web_development.easyauction.pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "bid")
public class BidModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "bidder_name", nullable = false)
    private String bidderName;
    @Column(name = "bid_date")
    private LocalDateTime bidDate = LocalDateTime.now();
    @ManyToOne
    @JoinColumn(name = "lot_id", nullable = false)
    private LotModel lot;

    public BidModel(String bidderName, LotModel lot) {
        this.bidderName = bidderName;
        this.bidDate = LocalDateTime.now();
        this.lot = lot;
    }
}
