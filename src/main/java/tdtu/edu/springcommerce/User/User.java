package tdtu.edu.springcommerce.User;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import tdtu.edu.springcommerce.Entity.CartItem;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;
    private boolean enabled;

}
