package lk.ijse.csco.business.custom.impl;

import lk.ijse.csco.business.custom.ManagePaymentBO;
import lk.ijse.csco.dto.PaymentDTO;

import java.util.List;

public class ManagePaymentBOImpl implements ManagePaymentBO {

    @Override
    public List<PaymentDTO> getPayment() throws Exception {
        return null;
    }

    @Override
    public boolean createPayment(PaymentDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updatePayment(PaymentDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deletePayment(String code) throws Exception {
        return false;
    }

    @Override
    public PaymentDTO findPayment(String itemCode) throws Exception {
        return null;
    }
}
