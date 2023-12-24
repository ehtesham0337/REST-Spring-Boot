package FYP.MatchPoint.backend.service;

import FYP.MatchPoint.backend.model.Users.User;
import FYP.MatchPoint.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(UUID user_id) {
        return userRepository.findById(user_id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
    }

    public User addUser(User new_user) {
        return userRepository.save(new_user);
    }

    public ResponseEntity<User> updateUser(UUID user_id, User user_to_update) {
        User current_user = userRepository.findById(user_id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        if (current_user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        User updatedUser = new User();
        updatedUser.setId(current_user.getId());
        updatedUser.setEmail(current_user.getEmail());
        updatedUser.setName(user_to_update.getName());
        updatedUser.setPassword(user_to_update.getPassword());
        updatedUser.setRole(user_to_update.getRole());
        updatedUser.setAge(user_to_update.getAge());
        updatedUser.setGender(user_to_update.getGender());
        updatedUser.setReliability(user_to_update.getReliability());
        updatedUser.setLocation(user_to_update.getLocation());
        updatedUser.setRuns(user_to_update.getRuns());
        updatedUser.setGoals(user_to_update.getGoals());

        userRepository.save(updatedUser);

        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

}
