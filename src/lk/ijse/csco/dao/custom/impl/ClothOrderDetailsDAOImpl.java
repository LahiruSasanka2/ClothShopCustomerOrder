package lk.ijse.csco.dao.custom.impl;

import lk.ijse.csco.dao.CrudUtil;
import lk.ijse.csco.dao.custom.ClothOrderDetailsDAO;
import lk.ijse.csco.entity.ClothOrderDetails;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClothOrderDetailsDAOImpl implements ClothOrderDetailsDAO {

    @Override
    public Optional<ClothOrderDetails> find(String key) throws Exception {
        ResultSet rst = CrudUtil
                .execute("SELECT * FROM clothorderdetail WHERE coid=?", key);
        ClothOrderDetails clothOrderDetails = null;
        if (rst.next()) {
            clothOrderDetails = new ClothOrderDetails(
                    rst.getString(1),
                    rst.getString(2)
            );
        }
        return Optional.ofNullable(clothOrderDetails);
    }

    @Override
    public Optional<List<ClothOrderDetails>> findAll() throws Exception {
        ArrayList<ClothOrderDetails> clothOrderDetails = new ArrayList<>();
        ResultSet rst = CrudUtil.execute("SELECT * FROM clothorderdetail");
        while (rst.next()) {
            ClothOrderDetails clothOrderDetails1 = new ClothOrderDetails(
                    rst.getString(1),
                    rst.getString(2)
            );
            clothOrderDetails.add(clothOrderDetails1);
        }
        return Optional.ofNullable(clothOrderDetails);
    }

    @Override
    public boolean save(ClothOrderDetails entity) throws Exception {
        return CrudUtil.<Integer>execute("INSERT INTO clothorderdetail VALUES (?,?)",
                entity.getCoid(),
                entity.getClid()
        ) > 0;
    }

    @Override
    public boolean update(ClothOrderDetails entity) throws Exception {
        return CrudUtil.<Integer>execute(
                "UPDATE clothorderdetail SET clid=? WHERE coid=?",
                entity.getClid(),
                entity.getCoid()
        ) > 0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return CrudUtil.<Integer>execute("DELETE FROM clothorderdetail WHERE coid=?", key) > 0;
    }
}
