package com.fanqilong.intergration;


import com.fanqilong.intergration.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
