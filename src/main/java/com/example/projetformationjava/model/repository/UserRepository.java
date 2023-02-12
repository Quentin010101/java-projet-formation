package com.example.projetformationjava.model.repository;

import com.example.projetformationjava.model.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserBean, Long> {
    UserBean findBySessionId(String sessionId);

}
