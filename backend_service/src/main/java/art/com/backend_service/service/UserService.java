package art.com.backend_service.service;

import art.com.backend_service.DTO.UserDTO;
import art.com.backend_service.Entity.UserInfo;
import art.com.backend_service.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
//    public UserInfo DTOTOUser(UserDTO userDTO){
//        UserInfo user=new UserInfo();
//        user.setId_user(userDTO.getId());
//        user.setActivities(userDTO.get);
//
//    }
}
