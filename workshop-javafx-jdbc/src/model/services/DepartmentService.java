package model.services;

import java.util.List;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
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
    
    private DepartmentDao dao = DaoFactory.createDepartmentDao();
    
    public List<Department> findAll() {
        return dao.findAll();
    }
    
}
