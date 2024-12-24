package lk.edu.icet110.service;

import lk.edu.icet110.dto.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> getAllAdmin();

    void addAdmin(Admin admin);

    void deleteAdminByID(Integer id);

    Admin searchAdminByID(Integer id);

    void updateAdmin(Admin admin);
}
