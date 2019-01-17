package lk.ijse.csco.business.custom;

import lk.ijse.csco.business.SuperBO;
import lk.ijse.csco.dto.PaymentDTO;

import java.util.List;

public interface ManagePaymentBO extends SuperBO {

    List<PaymentDTO> getPayment() throws Exception;

    boolean createPayment(PaymentDTO dto) throws Exception;

    boolean updatePayment(PaymentDTO dto) throws Exception;

    boolean deletePayment(String code) throws Exception;

    PaymentDTO findPayment(String itemCode) throws Exception;


}
