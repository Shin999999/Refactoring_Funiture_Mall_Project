package hello.refurnituremall.model.entity.auth;

import hello.refurnituremall.model.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "USER")
@SequenceGenerator(
        name = "USER_SEQUENCE_GENERATOR"
        , sequenceName = "USER_SEQUENCE"
        , allocationSize = 1
)
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends BaseTimeEntity {
    @Id
    private int id; // 기본키
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "USER_SEQUENCE_GENERATOR"
    )

    private String loginId;

    private String password;

    private String email;

    private String name;

    private String gender;

    private String birthday;

    private String tel;

    // 사용자 역할(권한)
    @Enumerated(EnumType.STRING)
    private ERole role;

    // 신규 유저 생성 시 사용
    // 생성자 (role 제외)
    public User(String loginId, String email, String password, String name, String gender, String birthday, String tel) {
        this.loginId = loginId;
        this.email = email;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.tel = tel;
    }
}