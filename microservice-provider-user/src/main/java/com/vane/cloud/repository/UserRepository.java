package com.vane.cloud.repository;

/**
 * @Author Vane
 * @Date 2018年05月14日
 */
import com.vane.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
