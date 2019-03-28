package tn.trio.UserService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.trio.UserService.entities.User;

public interface UserDao extends JpaRepository<User, Long>  {

}
