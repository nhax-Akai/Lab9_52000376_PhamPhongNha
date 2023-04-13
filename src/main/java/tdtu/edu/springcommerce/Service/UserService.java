package tdtu.edu.springcommerce.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tdtu.edu.springcommerce.Repository.UserRepository;
import tdtu.edu.springcommerce.User.User;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(long id)
    {
        return userRepository.findById(id).get();
    }

    public User getUserByUsername(String name)
    {
        return userRepository.getUserByUsername(name);
    }

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
}
