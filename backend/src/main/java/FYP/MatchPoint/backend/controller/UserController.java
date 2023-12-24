package FYP.MatchPoint.backend.controller;

import FYP.MatchPoint.backend.model.Users.User;
import FYP.MatchPoint.backend.repository.UserRepository;
import FYP.MatchPoint.backend.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User")
@Validated
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get-all-users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public User getUser(@PathVariable UUID userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/add-user")
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody @NotEmpty @NotNull @Valid User new_user) {
        return userService.addUser(new_user);

    }

    @PutMapping("/update-user/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public User updateUser(@PathVariable("userId") @Valid UUID userId, @RequestBody @NotEmpty @NotNull @Valid User updated_user) {
        return userService.updateUser(userId, updated_user).getBody();
    }

}
