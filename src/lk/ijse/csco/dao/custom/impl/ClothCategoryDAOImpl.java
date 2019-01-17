package lk.ijse.csco.dao.custom.impl;

import lk.ijse.csco.dao.CrudUtil;
import lk.ijse.csco.dao.custom.ClothCategoryDAO;
import lk.ijse.csco.entity.ClothCategory;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClothCategoryDAOImpl implements ClothCategoryDAO {

    @Override
    public Optional<ClothCategory> find(String key) throws Exception {
        ResultSet rst = CrudUtil
                .execute("SELECT * FROM clothcategory WHERE ccid=?", key);
        ClothCategory clothCategory = null;
        if (rst.next()) {
            clothCategory = new ClothCategory(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
            );
        }
        return Optional.ofNullable(clothCategory);
    }

    @Override
    public Optional<List<ClothCategory>> findAll() throws Exception {
        ArrayList<ClothCategory> clothCategories = new ArrayList<>();
        ResultSet rst = CrudUtil.execute("SELECT * FROM clothcategory");
        while (rst.next()) {
            ClothCategory clothCategory = new ClothCategory(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
            );
            clothCategories.add(clothCategory);
        }
        return Optional.ofNullable(clothCategories);
    }

    @Override
    public boolean save(ClothCategory entity) throws Exception {
        return CrudUtil.<Integer>execute("INSERT INTO clothcategory VALUES (?,?,?)",
                entity.getCcid(),
                entity.getPe_category(),
                entity.getType()
        ) > 0;
    }

    @Override
    public boolean update(ClothCategory entity) throws Exception {
        return CrudUtil.<Integer>execute(
                "UPDATE clothcategory SET pe_category=?,type=? WHERE ccid=?",
                entity.getPe_category(),
                entity.getType(),
                entity.getCcid()
        ) > 0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return CrudUtil.<Integer>execute("DELETE FROM clothcategory WHERE ccid=?", key) > 0;
    }
}
