package lk.ijse.csco.dao;

import lk.ijse.csco.dao.custom.impl.*;

public class DAOFactory {

    private static DAOFactory daoFactory;

    public enum DAOTypes{
        CUSTOMER,CLOTHORDER,CLOTHORDERDETAILS,PAYMENT,CLOTH,CLOTHCATEGORY,QUERY;
    }

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public <T extends SuperDAO> T getDAO(DAOTypes daoType) {
        switch (daoType) {
            case CUSTOMER:
                return (T) new CustomerDAOImpl();
            case CLOTHORDER:
                return (T) new ClothOrderDAOImpl();
            case CLOTHORDERDETAILS:
                return (T) new ClothOrderDetailsDAOImpl();
            case PAYMENT:
                return (T) new PaymentDAOImpl();
            case CLOTH:
                return (T) new ClothDAOImpl();
            case CLOTHCATEGORY:
                return (T) new ClothCategoryDAOImpl();
            case QUERY:
                return (T) new QueryDAOImpl();
            default:
                return null;
        }
    }
}
