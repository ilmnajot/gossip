package uz.ilmnajot.api_gossip.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.ilmnajot.api_gossip.dto.ProfileDTO;
import uz.ilmnajot.api_gossip.entity.ProfileEntity;
import uz.ilmnajot.api_gossip.enums.GeneralStatus;
import uz.ilmnajot.api_gossip.mapper.ProfileMapper;
import uz.ilmnajot.api_gossip.repository.ProfileRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {

    private final ProfileRepository profileRepository;
    private final PasswordEncoder passwordEncoder;
    private final ProfileMapper profileMapper;


    @Override
    public HttpEntity<?> register(ProfileDTO profileDTO) {
        Optional<ProfileEntity> optionalProfile = profileRepository.findByUsernameAndVisibleTrue(profileDTO.getUsername());
        if (optionalProfile.isPresent()) {
            ProfileEntity profile = optionalProfile.get();
            if (profile.getStatus().equals(GeneralStatus.IN_REGISTRATION)) {
                profileRepository.delete(profile);
            }
        }
        ProfileEntity profileEntity = profileMapper.toProfileRegisterEntity(profileDTO);
        ProfileEntity addedProfile = profileRepository.save(profileEntity);
        ProfileDTO profileDto = profileMapper.toProfileDto(addedProfile);
        return new ResponseEntity<>(profileDto, HttpStatus.CREATED);
    }

}
