package lk.ijse.csco.dao.custom.impl;

import lk.ijse.csco.dao.CrudUtil;
import lk.ijse.csco.dao.custom.ClothOrderDAO;
import lk.ijse.csco.entity.Order;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClothOrderDAOImpl implements ClothOrderDAO {

    @Override
    public Optional<Order> find(String key) throws Exception {
        ResultSet rst = CrudUtil
                .execute("SELECT * FROM clothorder WHERE coid=?", key);
        Order order = null;
        if (rst.next()) {
            order = new Order(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getInt(4),
                    rst.getString(5)
            );
        }
        return Optional.ofNullable(order);
    }

    @Override
    public Optional<List<Order>> findAll() throws Exception {
        ArrayList<Order> orders = new ArrayList<>();
        ResultSet rst = CrudUtil.execute("SELECT * FROM clothorder");
        while (rst.next()) {
            Order order = new Order(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getInt(4),
                    rst.getString(5)
            );
            orders.add(order);
        }
        return Optional.ofNullable(orders);
    }

    @Override
    public boolean save(Order entity) throws Exception {
        return CrudUtil.<Integer>execute("INSERT INTO clothorder VALUES (?,?,?,?,?)",
                entity.getCoid(),
                entity.getCid(),
                entity.getPid(),
                entity.getQty(),
                entity.getBarCode()
        ) > 0;
    }

    @Override
    public boolean update(Order entity) throws Exception {
        return CrudUtil.<Integer>execute(
                "UPDATE clothorder SET cid=?,pid=?,qty=?,barCode=? WHERE coid=?",
                entity.getCid(),
                entity.getPid(),
                entity.getQty(),
                entity.getBarCode(),
                entity.getCoid()
        ) > 0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return CrudUtil.<Integer>execute("DELETE FROM clothorder WHERE coid=?", key) > 0;
    }
}
