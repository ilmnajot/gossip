package uz.ilmnajot.api_gossip.service;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import uz.ilmnajot.api_gossip.dto.ProfileDTO;
import uz.ilmnajot.api_gossip.entity.ProfileEntity;
import uz.ilmnajot.api_gossip.exception.BadException;
import uz.ilmnajot.api_gossip.repository.ProfileRepository;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {

    private final ProfileRepository profileRepository;

    public AuthServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public HttpEntity<?> register(ProfileDTO profileDTO) {
        Optional<ProfileEntity> optionalProfile = profileRepository.findByUsernameAndVisibleTrue(profileDTO.getUsername());
        if (optionalProfile.isPresent()) {
            throw new BadException("Username already exists");
        }

        return null;
    }
}
