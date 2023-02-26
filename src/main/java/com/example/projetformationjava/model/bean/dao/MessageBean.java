package com.example.projetformationjava.model.bean.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "message")
@Getter
@Setter
public class MessageBean {
    @Id
    private long messageid;
    private String text;
    private String pseudoReciever;
    private String pseudoSender;
    private long date;

    public MessageBean() {
    }
    @Override
    public String toString() {
        return "MessageBean{" +
                "messageid=" + messageid +
                ", text='" + text + '\'' +
                ", pseudoReciever='" + pseudoReciever + '\'' +
                ", pseudoSender='" + pseudoSender + '\'' +
                '}';
    }
}
