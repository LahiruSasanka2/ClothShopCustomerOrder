package lk.ijse.csco.dao.custom.impl;

import lk.ijse.csco.dao.CrudUtil;
import lk.ijse.csco.dao.custom.PaymentDAO;
import lk.ijse.csco.entity.Payment;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PaymentDAOImpl implements PaymentDAO {

    @Override
    public Optional<Payment> find(String key) throws Exception {
        ResultSet rst = CrudUtil
                .execute("SELECT * FROM payment WHERE pid=?", key);
        Payment payment = null;
        if (rst.next()) {
            payment = new Payment(
                    rst.getString(1),
                    rst.getDouble(2),
                    rst.getDouble(3)
            );
        }
        return Optional.ofNullable(payment);
    }

    @Override
    public Optional<List<Payment>> findAll() throws Exception {
        ArrayList<Payment> payments = new ArrayList<>();
        ResultSet rst = CrudUtil.execute("SELECT * FROM payment");
        while (rst.next()) {
            Payment payment = new Payment(
                    rst.getString(1),
                    rst.getDouble(2),
                    rst.getDouble(3)
            );
            payments.add(payment);
        }
        return Optional.ofNullable(payments);
    }

    @Override
    public boolean save(Payment entity) throws Exception {
        return CrudUtil.<Integer>execute("INSERT INTO payment VALUES (?,?,?,?,?)",
                entity.getPid(),
                entity.getPePayAmount(),
                entity.getAmount()
        ) > 0;
    }

    @Override
    public boolean update(Payment entity) throws Exception {
        return CrudUtil.<Integer>execute(
                "UPDATE payment SET amount=?,custPayAmount=? WHERE pid=?",
                entity.getAmount(),
                entity.getPePayAmount(),
                entity.getPid()
        ) > 0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return CrudUtil.<Integer>execute("DELETE FROM payment WHERE pid=?", key) > 0;
    }
}
