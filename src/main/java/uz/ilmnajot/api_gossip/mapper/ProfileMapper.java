package uz.ilmnajot.api_gossip.mapper;

import org.springframework.stereotype.Component;
import uz.ilmnajot.api_gossip.dto.ProfileDTO;
import uz.ilmnajot.api_gossip.entity.ProfileEntity;

public interface ProfileMapper {

    ProfileDTO toProfileDto(ProfileEntity profileEntity);

    ProfileEntity toProfileRegisterEntity(ProfileDTO profileDTO);


}
