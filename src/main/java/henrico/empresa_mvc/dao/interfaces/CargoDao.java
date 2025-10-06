package henrico.empresa_mvc.dao.interfaces;

import java.util.List;

import henrico.empresa_mvc.model.Cargo;

public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
