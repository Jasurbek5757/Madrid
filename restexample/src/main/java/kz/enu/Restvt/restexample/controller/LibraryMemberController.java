package kz.enu.Restvt.restexample.controller;

import kz.enu.Restvt.restexample.entities.LibraryMember;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/members")
public class LibraryMemberController {
    private final List<LibraryMember> members = new ArrayList<>();

    @GetMapping
    public List<LibraryMember> getMembers() {
        return members;
    }

    @PostMapping
    public String addMember(@RequestBody LibraryMember member) {
        members.add(member);
        return "Member added: " + member.getName();
    }
}
