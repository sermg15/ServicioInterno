package org.example.SIaplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailController {

    @Autowired
    private emailService envioCorreo;

    @PostMapping("/email")
    public ResponseEntity<Void> enviarNotificacion(@RequestBody email Email){
        boolean respuesta = envioCorreo.send(Email);
        System.out.println(Email.getMensaje());
        if(respuesta){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
