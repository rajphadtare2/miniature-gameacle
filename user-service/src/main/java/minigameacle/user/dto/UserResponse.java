package minigameacle.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class UserResponse {
    String email;
    String name;
    Map<String, String> games;
}
