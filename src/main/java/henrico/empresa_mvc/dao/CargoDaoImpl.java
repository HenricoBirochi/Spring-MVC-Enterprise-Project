package henrico.empresa_mvc.dao;

import org.springframework.stereotype.Repository;

import henrico.empresa_mvc.dao.interfaces.CargoDao;
import henrico.empresa_mvc.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {
    
}
