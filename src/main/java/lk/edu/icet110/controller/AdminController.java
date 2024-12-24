package lk.edu.icet110.controller;

import lk.edu.icet110.dto.Admin;
import lk.edu.icet110.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@CrossOrigin
public class AdminController {

    @Autowired
    private final AdminService service;

    @GetMapping("/get-admin")
    public List<Admin> getAdmin(){
        return service.getAllAdmin();
    }

    @PostMapping("/add-admin")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAdmin(@RequestBody Admin admin){
        service.addAdmin(admin);
    }

    @GetMapping("/search-admin-by-id/{id}")
    public Admin getAdminById(@PathVariable Integer id){
        return service.searchAdminByID(id);
    }

    @DeleteMapping("/delete-admin-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteAdminById(@PathVariable Integer id){
        service.deleteAdminByID(id);
    }

    @PutMapping("/update-admin")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAdmin(@RequestBody Admin admin){
        service.updateAdmin(admin);
    }

}
