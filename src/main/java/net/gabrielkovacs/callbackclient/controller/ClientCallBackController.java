package net.gabrielkovacs.callbackclient.controller;


import net.gabrielkovacs.callbackclient.entities.ClientCallBack;
import net.gabrielkovacs.callbackclient.entities.ClientCallBackWithDate;
import net.gabrielkovacs.callbackclient.repository.ClientCallBackRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;

@RestController
public class ClientCallBackController {

    private ClientCallBackRepository clientCallBackRepository;

    public ClientCallBackController(ClientCallBackRepository clientCallBackRepository){
        this.clientCallBackRepository = clientCallBackRepository;
    }

    @PostMapping("data")
    public ResponseEntity<ClientCallBack> pushToWebHook(@RequestBody ClientCallBack cCB){
        Date date= new Date();
        ClientCallBackWithDate clientCallBackWithDate = new ClientCallBackWithDate(cCB.getUuid(),cCB.getCall_back(),
                cCB.getTimeStamp(),cCB.getEventName(),cCB.getParameter(),new Timestamp(date.getTime()).getTime());
        clientCallBackRepository.save(clientCallBackWithDate);
        return new ResponseEntity<ClientCallBack>(cCB, HttpStatus.CREATED);
    }
}
