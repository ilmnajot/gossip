package uz.ilmnajot.api_gossip.controller;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import uz.ilmnajot.api_gossip.entity.ProfileEntity;
import uz.ilmnajot.api_gossip.entity.ProfileRole;
import uz.ilmnajot.api_gossip.enums.Role;
import uz.ilmnajot.api_gossip.service.RoleService;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping("/addRole")
    public void addRole(@RequestParam("profileId") Long profileId, @RequestParam("role")Role role) {
        roleService.addRole(profileId, role);
    }
}
