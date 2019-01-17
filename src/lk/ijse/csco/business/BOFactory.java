package lk.ijse.csco.business;

import lk.ijse.csco.business.custom.impl.*;
import lk.ijse.csco.business.custom.impl.ManageCustomersBOImpl;
import lk.ijse.csco.business.custom.impl.ManageOrdersBOImpl;

public class BOFactory {

    public enum BOTypes{
        MANAGE_CUSTOMERS,MANAGE_CLOTHS,MANAGE_ORDERS,MANAGE_CATEGORY,MANAGE_PAYEMENT
    }

    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getInstance(){
        if (boFactory == null){
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public <T extends SuperBO> T getBO(BOTypes boType){
        switch (boType){
            case MANAGE_CUSTOMERS:
                return (T) new ManageCustomersBOImpl();
            case MANAGE_CLOTHS:
                return (T) new ManageClothBOImpl();
            case MANAGE_ORDERS:
                return (T) new ManageOrdersBOImpl();
            case MANAGE_CATEGORY:
                return (T) new ManageCategoryBOImpl();
            case MANAGE_PAYEMENT:
                return (T) new ManagePaymentBOImpl();
            default:
                return null;
        }
    }

}
