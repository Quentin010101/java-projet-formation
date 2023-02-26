package com.example.projetformationjava.model.service;

import com.example.projetformationjava.model.bean.dao.MessageBean;
import com.example.projetformationjava.model.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepo;

    public List<MessageBean> getAllMessageByPseudoReciever(String pseudo){
        return messageRepo.getMessageBeansByPseudoReciever(pseudo);
    }

    public void sendMessage(MessageBean message){
        messageRepo.save(message);
    }

    public void deleteMessage(String pseudoReciever, long idMessage){
        messageRepo.deleteByPseudoRecieverAndMessageid(pseudoReciever, idMessage);
    }
}
