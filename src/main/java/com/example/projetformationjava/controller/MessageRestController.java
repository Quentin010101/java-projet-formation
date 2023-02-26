package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.dao.MessageBean;
import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.bean.dto.ReturnMessageBean;
import com.example.projetformationjava.model.service.MessageService;
import com.example.projetformationjava.model.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RequestMapping("/message")
public class MessageRestController {

    @Autowired
    private MessageService messageService;
    @Autowired
    private UserService userService;

    @GetMapping("/getall")
    public List<MessageBean> getAll(HttpSession httpSession){
        System.out.println("message getall");

        try{
            UserBean user = userService.getUserBySession(httpSession.getId());
            if(user == null){
                throw new Exception("You need to be connected.");
            }
            return messageService.getAllMessageByPseudoReciever(user.getPseudo());
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("send")
    public ReturnMessageBean send(HttpSession httpSession, @RequestBody MessageBean message){
        System.out.println("message sent");
        System.out.println("message :" + message);

        try{
            UserBean user = userService.getUserBySession(httpSession.getId());
            if(user == null){
                throw new Exception("You need to be connected.");
            }
            if(message ==null || message.getText().equals("") || message.getPseudoReciever().equals("")){
                throw new Exception("pseudo and text are required.");
            }
            message.setPseudoSender(user.getPseudo());
            Date d = new Date();
            message.setDate(d.getTime());
            messageService.sendMessage(message);
            return new ReturnMessageBean(true, "Your message has been sent");
        }catch(Exception e){
            e.printStackTrace();
            return  new ReturnMessageBean(false, e.getMessage());
        }

    }

    @PostMapping("/delete")
    public ReturnMessageBean delete(HttpSession httpSession, @RequestBody MessageBean message){
        System.out.println("/delete");

        try{

            UserBean user = userService.getUserBySession(httpSession.getId());
            if(user == null){
                throw new Exception("You need to be connected.");
            }
            // Check if message is  null
            if(message.getPseudoReciever() == null || message.getPseudoSender() == null || message.getText() ==null){
                throw new Exception("Message is null");
            }
            // check if message belong to the user
            if(!message.getPseudoReciever().equals(user.getPseudo())){
                throw new Exception("Wrong user");
            }

            messageService.deleteMessage(message.getPseudoReciever(), message.getMessageid());

            return new ReturnMessageBean(true, "message has been deleted.");

        }catch(Exception e){
            e.printStackTrace();
            return new ReturnMessageBean(false, e.getMessage());
        }
    }
}
