package henrico.empresa_mvc.service.interfaces;

import java.util.List;

import henrico.empresa_mvc.model.Funcionario;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();
}
