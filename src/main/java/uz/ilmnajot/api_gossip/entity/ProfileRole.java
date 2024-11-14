package uz.ilmnajot.api_gossip.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.ilmnajot.api_gossip.enums.Role;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ProfileRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;

    @Column(name = "profile_role")
    @Enumerated(EnumType.STRING)
    private Role profileRole;

    @Column(name = "profile_id")
    private Long profileId;

    @ManyToOne
    @JoinColumn(name = "profile_id", insertable = false, updatable = false)
    private ProfileEntity profile;


    @Column(name = "created_date")
    private LocalDateTime createdDate;
}
