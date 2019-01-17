package lk.ijse.csco.business.custom;

import lk.ijse.csco.business.SuperBO;
import lk.ijse.csco.dto.OrderDTO;

import java.util.List;

public interface ManageOrdersBO extends SuperBO {

    List<OrderDTO> getClothOrders() throws Exception;

    List<OrderDTO> getOrders() throws Exception;

    String generateOrderId() throws Exception;

    void createOrder(OrderDTO dto) throws Exception;

    OrderDTO findOrder(String orderId) throws Exception;

}
