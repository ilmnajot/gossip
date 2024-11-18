package uz.ilmnajot.api_gossip.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import uz.ilmnajot.api_gossip.entity.ProfileEntity;
import uz.ilmnajot.api_gossip.enums.Role;
import uz.ilmnajot.api_gossip.exception.ResourceNotFoundException;
import uz.ilmnajot.api_gossip.repository.ProfileRepository;
import uz.ilmnajot.api_gossip.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final ProfileRepository profileRepository;

    public RoleServiceImpl(RoleRepository roleRepository, ProfileRepository profileRepository) {
        this.roleRepository = roleRepository;
        this.profileRepository = profileRepository;
    }

    @Override
    public void addRole(Long profileId, Role role) {
        ProfileEntity profileEntity = profileRepository.findById(profileId).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }
}
