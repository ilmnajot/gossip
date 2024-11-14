package uz.ilmnajot.api_gossip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.ilmnajot.api_gossip.entity.ProfileEntity;

import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

    Optional<ProfileEntity> findByUsernameAndVisibleTrue(String username);
}
