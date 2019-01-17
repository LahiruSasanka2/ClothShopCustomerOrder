package lk.ijse.csco.business;

import lk.ijse.csco.dto.*;
import lk.ijse.csco.entity.*;

import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    public static <T extends SuperDTO> T getDTO(SuperEntity entity) {
        if (entity instanceof Customer) {
            Customer c = (Customer) entity;
            return (T) new CustomerDTO(
                    c.getCid(),
                    c.getName(),
                    c.getTell()
            );
        }
        else if (entity instanceof Payment) {
            Payment i = (Payment) entity;
            return (T) new PaymentDTO(
                    i.getPid(),
                    i.getAmount(),
                    i.getPePayAmount()
            );
        }
        else if (entity instanceof Cloth) {
            Cloth i = (Cloth) entity;
            return (T) new ClothDTO(
                    i.getClid(),
                    i.getCcid(),
                    i.getColor(),
                    i.getSize(),
                    i.getPrice(),
                    i.getQty(),
                    i.getBarCode()
            );
        }
        else if (entity instanceof ClothCategory) {
            ClothCategory i = (ClothCategory) entity;
            return (T) new ClothCategoryDTO(
                    i.getCcid(),
                    i.getPe_category(),
                    i.getType()
            );
        }
        else if (entity instanceof ClothOrderDetails) {
            ClothOrderDetails i = (ClothOrderDetails) entity;
            return (T) new ClothOrderDetailsDTO(
                    i.getCoid(),
                    i.getClid()
            );
        }
        else if (entity instanceof Payment) {
            Payment i = (Payment) entity;
            return (T) new PaymentDTO(
                    i.getPid(),
                    i.getAmount(),
                    i.getPePayAmount()
            );
        }
        else {
            throw new RuntimeException("This entity can't be converted to a DTO");
        }
    }

    public static <T extends SuperEntity> T getEntity(SuperDTO dto) {
        if (dto instanceof CustomerDTO) {
            CustomerDTO c = (CustomerDTO) dto;
            return (T) new Customer(
                    c.getCid(),
                    c.getName(),
                    c.getTell()
            );
        }
        else if (dto instanceof PaymentDTO) {
            PaymentDTO i = (PaymentDTO) dto;
            return (T) new Payment(
                    i.getPid(),
                    i.getAmount(),
                    i.getPePayAmount()
            );
        }
        else if (dto instanceof ClothDTO) {
            ClothDTO i = (ClothDTO) dto;
            return (T) new Cloth(
                    i.getClid(),
                    i.getCcid(),
                    i.getColor(),
                    i.getSize(),
                    i.getPrice(),
                    i.getQty(),
                    i.getBarCode()
            );
        }
        else if (dto instanceof ClothCategoryDTO) {
            ClothCategoryDTO i = (ClothCategoryDTO) dto;
            return (T) new ClothCategory(
                    i.getCcid(),
                    i.getPe_category(),
                    i.getType()
            );
        }
        else if (dto instanceof ClothOrderDetailsDTO) {
            ClothOrderDetailsDTO i = (ClothOrderDetailsDTO) dto;
            return (T) new ClothOrderDetails(
                    i.getCoid(),
                    i.getClid()
            );
        }
        else if (dto instanceof PaymentDTO) {
            PaymentDTO i = (PaymentDTO) dto;
            return (T) new Payment(
                    i.getPid(),
                    i.getAmount(),
                    i.getPePayAmount()
            );
        }
        else {
            throw new RuntimeException("This DTO can't be converted to an entity");
        }
    }

    public static <T extends SuperDTO> List<T> getDTOList(List<? extends SuperEntity> entities) {
        return entities.stream().map(Converter::<T>getDTO).collect(Collectors.toList());
    }

    public static <T extends SuperEntity> List<T> getEntityList(List<? extends SuperDTO> dtos) {
        return dtos.stream().map(Converter::<T>getEntity).collect(Collectors.toList());

    }

    // =========================================================================

    public static <T extends SuperDTO> T getDTO(CustomEntity entity, Class<T> dtoClass) {
//        if (dtoClass == OrderDTO2.class) {
//            return (T) new OrderDTO2(entity.getOrderId(), entity.getOrderDate().toLocalDate(),
//                    entity.getCustomerId(), entity.getCustomerName(), entity.getTotal());
//        } else if (dtoClass == OrderDetailDTO.class) {
//            return (T) new OrderDetailDTO(entity.getItemCode(), entity.getDescription(), entity.getQty(), entity.getUnitPrice());
//        } else {
//            throw new RuntimeException("Not Supported DTO");
//        }
        return null;
    }

    public static <T extends SuperDTO> List<T> getDTOList(List<CustomEntity> list, Class<T> dtoClass) {
        return list.stream().map(c -> getDTO(c, dtoClass)).collect(Collectors.toList());
    }

}
