package com.timelinelp.api.user;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.timelinelp.api.timeline.Timeline;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
//teste

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String email;
    private String password;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user")
    private List<Timeline> timeline;

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdAt = LocalDateTime.now();
    }

}
