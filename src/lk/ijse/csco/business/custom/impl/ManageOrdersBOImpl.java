package lk.ijse.csco.business.custom.impl;

import lk.ijse.csco.business.custom.ManageOrdersBO;
import lk.ijse.csco.business.Converter;
import lk.ijse.csco.business.custom.ManageOrdersBO;
import lk.ijse.csco.dao.DAOFactory;
import lk.ijse.csco.dto.OrderDTO;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ManageOrdersBOImpl implements ManageOrdersBO {

    @Override
    public List<OrderDTO> getClothOrders() throws Exception {
        return null;
    }

    @Override
    public List<OrderDTO> getOrders() throws Exception {
        return null;
    }

    @Override
    public String generateOrderId() throws Exception {
        return null;
    }

    @Override
    public void createOrder(OrderDTO dto) throws Exception {

    }

    @Override
    public OrderDTO findOrder(String orderId) throws Exception {
        return null;
    }
}
