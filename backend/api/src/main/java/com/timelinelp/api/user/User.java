package com.timelinelp.api.user;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
    private ArrayList<Timeline> timeline;


    public String getName(){
        return this.name;
    }
}
