package lk.ijse.csco.dao.custom.impl;

import lk.ijse.csco.dao.CrudDAO;
import lk.ijse.csco.dao.custom.QueryDAO;
import lk.ijse.csco.entity.CustomEntity;

import java.util.List;
import java.util.Optional;

public class QueryDAOImpl implements QueryDAO {
    @Override
    public Optional<CustomEntity> find(String key) throws Exception {
        return Optional.empty();
    }

    @Override
    public Optional<List<CustomEntity>> findAll() throws Exception {
        return Optional.empty();
    }

    @Override
    public boolean save(CustomEntity entity) throws Exception {
        return false;
    }

    @Override
    public boolean update(CustomEntity entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return false;
    }
}
