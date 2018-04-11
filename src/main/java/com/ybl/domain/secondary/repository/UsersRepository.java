package com.ybl.domain.secondary.repository;

import com.ybl.domain.secondary.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by duanwj on 2018/4/11 0011 10:28
 */
public interface UsersRepository extends JpaRepository<Users,Integer> {
}
