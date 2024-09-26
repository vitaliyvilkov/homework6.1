package ru.netology.web.data;

import lombok.Value;

import java.util.Random;

public class DataHelper {

    private DataHelper() {
    }

    @Value
    public static class UserInfo {
        private String login;
        private String password;
    }

    public static UserInfo getUserInfo() {
        return new UserInfo("vasya", "qwerty123");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCode(UserInfo userInfo) {
        return new VerificationCode("12345");
    }

    @Value
    public static class CardInfo {
        private String cardNumber;
        private String testId;
    }

    public static CardInfo getFirstCardInfo() {
        return new CardInfo("5559 0000 0000 0001", "92df3f1c-a033-48e6-8390-206f6b1f56c0");
    }

    public static CardInfo getSecondCardInfo() {
        return new CardInfo("5559 0000 0000 0002", "0f3f5c2a-249e-4c3d-8287-09f7a039391d");
    }

    public static int getValidAmount(int balance) {
        return new Random().nextInt(Math.abs(balance)) + 1;
    }

    public static int getInvalidAmount(int balance) {
        return Math.abs(balance) + new Random().nextInt(1000) + 1;
    }
}