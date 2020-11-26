package com.bta.brokeremulator.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "TRADE_TRANSACTION")
@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class TradeTransaction  implements Serializable {

    @Id
    @SequenceGenerator(name ="TRADE_TRANSACTION_SEQ", sequenceName = "TRADE_TRANSACTION_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRADE_TRANSACTION_SEQ")
    private Long id;


    @Size(max = 10)
    @NotNull
    @Column(name="sticker", length = 10,nullable = false)
    private String sticker;

    @Min(0)
    @NotNull
    @Column(name="amount", nullable = false)
    private Integer amount;


    @NotNull
    @Column(name="price", nullable = false)
    private Double price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)   //у всех верхних обьектов будет Юзер аккаунт сразу
    @JoinColumn(name ="user_account_id", nullable = false)
    @NotNull
    private UserAccount userAccount;
}
