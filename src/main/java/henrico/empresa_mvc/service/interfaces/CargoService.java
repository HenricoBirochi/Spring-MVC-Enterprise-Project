package henrico.empresa_mvc.service.interfaces;

import java.util.List;

import henrico.empresa_mvc.model.Cargo;

public interface CargoService {

    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void excluir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();
}
