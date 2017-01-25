package com.mastercard.labs.mpqrpayment.database.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * @author Muhammad Azeem (muhammad.azeem@mastercard.com) on 1/25/17
 */
public class Card extends RealmObject {
    private String bankName;
    private String cardType;
    private double balance;

    @PrimaryKey
    private String cardNumber;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardType getCardType() {
        return CardType.valueOf(cardType);
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType.name();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
