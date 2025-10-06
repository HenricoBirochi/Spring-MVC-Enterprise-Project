package henrico.empresa_mvc.dao.interfaces;

import java.util.List;

import henrico.empresa_mvc.model.Funcionario;

public interface FuncionarioDao {

    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
