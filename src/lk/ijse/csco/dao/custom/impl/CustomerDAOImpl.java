package lk.ijse.csco.dao.custom.impl;

import lk.ijse.csco.dao.CrudUtil;
import lk.ijse.csco.dao.custom.CustomerDAO;
import lk.ijse.csco.entity.Customer;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public Optional<Customer> find(String key) throws Exception {
        ResultSet rst = CrudUtil
                .execute("SELECT * FROM customer WHERE cid=?", key);
        Customer customer = null;
        if (rst.next()) {
            customer = new Customer(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
            );
        }
        return Optional.ofNullable(customer);
    }

    @Override
    public Optional<List<Customer>> findAll() throws Exception {
        ArrayList<Customer> customers = new ArrayList<>();
        ResultSet rst = CrudUtil.execute("SELECT * FROM customer");
        while (rst.next()) {
            Customer customer = new Customer(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
            );
            customers.add(customer);
        }
        return Optional.ofNullable(customers);
    }

    @Override
    public boolean save(Customer entity) throws Exception {
        return CrudUtil.<Integer>execute("INSERT INTO customer VALUES (?,?,?)",
                entity.getCid(),
                entity.getName(),
                entity.getTell()
        ) > 0;
    }

    @Override
    public boolean update(Customer entity) throws Exception {
        return CrudUtil.<Integer>execute(
                "UPDATE customer SET name=?,tell=? WHERE cid=?",
                entity.getName(),
                entity.getTell(),
                entity.getCid()
        ) > 0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return CrudUtil.<Integer>execute("DELETE FROM customer WHERE cid=?", key) > 0;
    }
}
