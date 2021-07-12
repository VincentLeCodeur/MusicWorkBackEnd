package com.example.QRCodeAPI;

public class QRCode {
    private String code;

    public QRCode(){
    }

    public QRCode(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "QRCode{" +
                "content='" + code + '\'' +
                '}';
    }
}