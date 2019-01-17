package lk.ijse.csco.business.custom.impl;

import lk.ijse.csco.business.custom.ManageCustomersBO;
import lk.ijse.csco.business.Converter;
import lk.ijse.csco.dao.DAOFactory;
import lk.ijse.csco.dao.custom.CustomerDAO;
import lk.ijse.csco.dto.CustomerDTO;

import java.util.List;

public class ManageCustomersBOImpl implements ManageCustomersBO {

    private CustomerDAO customerDAO;

    public ManageCustomersBOImpl() {
        customerDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    }

    public List<CustomerDTO> getCustomers() throws Exception {
        return customerDAO.findAll().map(Converter::<CustomerDTO>getDTOList).get();
    }

    public boolean createCustomer(CustomerDTO dto) throws Exception {
        return customerDAO.save(Converter.getEntity(dto));
    }

    public boolean updateCustomer(CustomerDTO dto) throws Exception {
        return customerDAO.update(Converter.getEntity(dto));
    }

    public boolean deleteCustomer(String customerID) throws Exception {
        return customerDAO.delete(customerID);
    }

    public CustomerDTO findCustomer(String id) throws Exception {
        return customerDAO.find(id).map(Converter::<CustomerDTO>getDTO).orElse(null);
    }

}
