package uz.ilmnajot.api_gossip.service;

import org.springframework.http.HttpEntity;
import uz.ilmnajot.api_gossip.dto.ProfileDTO;

public interface AuthService {
    HttpEntity<?> register(ProfileDTO profileDTO);
}
