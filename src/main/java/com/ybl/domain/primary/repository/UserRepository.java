package com.ybl.domain.primary.repository;

import com.ybl.domain.primary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by duanwj on 2018/4/11 0011 10:28
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
