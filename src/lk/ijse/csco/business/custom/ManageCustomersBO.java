package lk.ijse.csco.business.custom;

import lk.ijse.csco.business.SuperBO;
import lk.ijse.csco.dto.CustomerDTO;

import java.util.List;

public interface ManageCustomersBO extends SuperBO {

    List<CustomerDTO> getCustomers() throws Exception;

    boolean createCustomer(CustomerDTO dto) throws Exception;

    boolean updateCustomer(CustomerDTO dto) throws Exception;

    boolean deleteCustomer(String customerID) throws Exception;

    CustomerDTO findCustomer(String id) throws Exception;


}
