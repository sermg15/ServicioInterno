package org.example.SIaplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


@Service
public class EmailService {

    @Autowired
    private JavaMailSender sender;

        public boolean send(Email mensaje){

        MimeMessage email = sender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(email,true);
            helper.setFrom("supermercasa.33@outlook.es");
            helper.setTo(mensaje.getDestinatario());
            helper.setSubject(mensaje.getAsunto());
            helper.setText(mensaje.getMensaje(), true);
            

            sender.send(email);

            return true;

        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }

    }

}
