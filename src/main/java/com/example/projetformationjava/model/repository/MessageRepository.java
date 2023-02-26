package com.example.projetformationjava.model.repository;

import com.example.projetformationjava.model.bean.dao.MessageBean;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<MessageBean, Long> {
    List<MessageBean> getMessageBeansByPseudoReciever(String pseudo);

    @Transactional
    void deleteByPseudoRecieverAndMessageid(String pseudo, long idMessage);

}
