package com.zrashwani.demo.repository;

import com.zrashwani.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query(value = "select * from users order by id desc", nativeQuery = true)
    List<Users> getAll();
}
