package henrico.empresa_mvc.dao;

import org.springframework.stereotype.Repository;

import henrico.empresa_mvc.dao.interfaces.FuncionarioDao;
import henrico.empresa_mvc.model.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {
    
}
