package art.com.backend_service.service;

import art.com.backend_service.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
//    public User DTOTOUser(UserDTO userDTO){
//        User user=new User();
//        user.setId_user(userDTO.getId());
//        user.setActivities(userDTO.get);
//
//    }
}
