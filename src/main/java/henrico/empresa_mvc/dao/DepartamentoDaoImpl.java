package henrico.empresa_mvc.dao;

import org.springframework.stereotype.Repository;

import henrico.empresa_mvc.dao.interfaces.DepartamentoDao;
import henrico.empresa_mvc.model.Departamento;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {
    
}
