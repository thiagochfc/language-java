package model.services;

import java.util.ArrayList;
import java.util.List;
import model.entities.Department;

/*******************************************************************************
 * 
 * Sistema          : Workshop
 * Finalidade       : Classe responsável pelo serviço do Department
 * Data de criação  : 30/12/2018
 * Autor            : Thiago Christopher
 * ============================================================================
 * 
 * Alterado por     :
 * Finalidade       :
 * Autor            :
 * 
 ******************************************************************************/

public class DepartmentService {
    
    public List<Department> findAll() {
        List<Department> list = new ArrayList<>();
        list.add(new Department(1, "Books"));
        list.add(new Department(2, "Computers"));
        list.add(new Department(3, "Electronics"));
        return list;
    }
    
}
