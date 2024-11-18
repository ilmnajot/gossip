package uz.ilmnajot.api_gossip.mapper;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import uz.ilmnajot.api_gossip.dto.ProfileDTO;
import uz.ilmnajot.api_gossip.entity.ProfileEntity;
import uz.ilmnajot.api_gossip.enums.GeneralStatus;

import java.time.LocalDateTime;

@Component
public class ProfileMapperImpl implements ProfileMapper {

    private final PasswordEncoder passwordEncoder;

    public ProfileMapperImpl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public ProfileEntity toProfileRegisterEntity(ProfileDTO profileDTO) {
        return ProfileEntity
                .builder()
                .name(profileDTO.getName())
                .username(profileDTO.getUsername())
                .password(passwordEncoder.encode(profileDTO.getPassword()))
                .visible(true)
                .status(GeneralStatus.IN_REGISTRATION)
                .createdDate(LocalDateTime.now())
                .build();
    }

    public ProfileDTO toProfileDto(ProfileEntity profileEntity) {
        ProfileDTO profileDTO = new ProfileDTO();
        profileDTO.setName(profileEntity.getName());
        profileDTO.setUsername(profileEntity.getUsername());
        profileDTO.setPassword(profileEntity.getPassword());
        return profileDTO;
    }
}
