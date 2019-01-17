package lk.ijse.csco.dao.custom.impl;

import lk.ijse.csco.dao.CrudUtil;
import lk.ijse.csco.dao.custom.ClothDAO;
import lk.ijse.csco.entity.Cloth;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClothDAOImpl implements ClothDAO {

    @Override
    public Optional<Cloth> find(String key) throws Exception {
        ResultSet rst = CrudUtil
                .execute("SELECT * FROM cloth WHERE clid=?", key);
        Cloth cloth = null;
        if (rst.next()) {
            cloth = new Cloth(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getInt(6),
                    rst.getString(7)
            );
        }
        return Optional.ofNullable(cloth);
    }

    @Override
    public Optional<List<Cloth>> findAll() throws Exception {
        ArrayList<Cloth> cloths = new ArrayList<>();
        ResultSet rst = CrudUtil.execute("SELECT * FROM cloth");
        while (rst.next()) {
            Cloth cloth = new Cloth(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getInt(6),
                    rst.getString(7)
            );
            cloths.add(cloth);
        }
        return Optional.ofNullable(cloths);
    }

    @Override
    public boolean save(Cloth entity) throws Exception {
        return CrudUtil.<Integer>execute("INSERT INTO cloth VALUES (?,?,?,?,?,?,?)",
                entity.getClid(),
                entity.getColor(),
                entity.getSize(),
                entity.getPrice(),
                entity.getQty(),
                entity.getBarCode()
        ) > 0;
    }

    @Override
    public boolean update(Cloth entity) throws Exception {
        return CrudUtil.<Integer>execute(
                "UPDATE cloth SET ccid=?,color=?,size=?,price=?,qty=?,barCode=? WHERE clid=?",
                entity.getCcid(),
                entity.getColor(),
                entity.getSize(),
                entity.getPrice(),
                entity.getQty(),
                entity.getBarCode(),
                entity.getClid()
        ) > 0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return CrudUtil.<Integer>execute("DELETE FROM cloth WHERE clid=?", key) > 0;
    }
}
