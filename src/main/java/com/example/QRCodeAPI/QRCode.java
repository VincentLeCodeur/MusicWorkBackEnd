package com.example.QRCodeAPI;

public class QRCode {
    private final String content;

    public QRCode(String content){
        this.content = content;
    }

    @Override
    public String toString() {
        return "QRCode{" +
                "content='" + content + '\'' +
                '}';
    }
}
