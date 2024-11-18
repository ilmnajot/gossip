package uz.ilmnajot.api_gossip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ilmnajot.api_gossip.entity.ProfileRole;

@Repository
public interface RoleRepository extends JpaRepository<ProfileRole, Long> {


}
