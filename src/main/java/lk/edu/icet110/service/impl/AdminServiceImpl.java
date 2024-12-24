package lk.edu.icet110.service.impl;

import lk.edu.icet110.dto.Admin;
import lk.edu.icet110.entity.AdminEntity;
import lk.edu.icet110.repository.AdminRepository;
import lk.edu.icet110.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Admin> getAllAdmin() {
        List<Admin> adminArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            adminArrayList.add(mapper.map(entity, Admin.class));
        });
        return adminArrayList;
    }

    @Override
    public void addAdmin(Admin admin) {
        repository.save(mapper.map(admin, AdminEntity.class));
    }

    @Override
    public void deleteAdminByID(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Admin searchAdminByID(Integer id) {
        return mapper.map(repository.findById(id), Admin.class);
    }

    @Override
    public void updateAdmin(Admin admin) {
        repository.save(mapper.map(admin, AdminEntity.class));
    }
}
