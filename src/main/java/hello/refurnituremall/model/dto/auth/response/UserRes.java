package hello.refurnituremall.model.dto.auth.response;

import hello.refurnituremall.model.entity.auth.ERole;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserRes {

    private String accessToken; // 웹토큰
    private String tokenType = "Bearer"; // 웹토큰 타입
    private String email;     // 이메일ID
    private String name;      // 유저명

    @Enumerated(EnumType.STRING)
    private ERole role;       // 권한명

    public UserRes(String accessToken, String email, String name, ERole role) {
        this.accessToken = accessToken;
        this.email = email;
        this.name = name;
        this.role = role;
    }
}
