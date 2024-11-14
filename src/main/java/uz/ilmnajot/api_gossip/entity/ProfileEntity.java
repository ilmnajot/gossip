package uz.ilmnajot.api_gossip.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.ilmnajot.api_gossip.enums.GeneralStatus;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "profile_entity")
@Builder
public class ProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username; // email/phone

    @Column(name = "password")
    private String password;

    @Column(name = "visible")
    private Boolean visible = Boolean.TRUE;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private GeneralStatus status; //ACTIVE, BLOCK

    @Column(name = "created_date")
    private LocalDateTime createdDate;



}
