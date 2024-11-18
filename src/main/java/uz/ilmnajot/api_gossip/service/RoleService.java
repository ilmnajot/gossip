package uz.ilmnajot.api_gossip.service;

import uz.ilmnajot.api_gossip.enums.Role;

public interface RoleService {
    void addRole(Long profileId, Role role);
}
