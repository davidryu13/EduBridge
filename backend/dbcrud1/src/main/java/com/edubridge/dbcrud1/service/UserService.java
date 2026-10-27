package com.edubridge.dbcrud1.service;

import org.springframework.stereotype.Service;
import com.edubridge.dbcrud1.entity.User;
import com.edubridge.dbcrud1.repository.UserRepository;

@Service 
public class UserService {
    private UserRepository urepo;
    //Create
    public User createUser(User user) {
        return urepo.save(user);
    }
    //Read
    public User getUserById(Long id) {
        return urepo.findById(id).orElse(null);
    }
    public List<User> getAllUsers() {
        return urepo.findAll();
    }
    //Update
    public User updateUser(Long id, User user) {
        if (urepo.existsById(id)) {
            user.setId(id);
            return urepo.save(user);
        }
        return null;
    }
    //Delete
    public boolean deleteUser(Long id) {
        if (urepo.existsById(id)) {
            urepo.deleteById(id);
            return true;
        }
        return false;
    }
}
