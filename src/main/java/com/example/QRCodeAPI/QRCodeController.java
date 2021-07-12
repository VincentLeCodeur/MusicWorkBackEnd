package com.example.QRCodeAPI;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;

@RestController
public class QRCodeController {

    @PutMapping("/code")
    public QRCode putRequest(@RequestBody QRCode newQRCode){
        System.out.println(newQRCode.toString());
        return newQRCode;
    }


}