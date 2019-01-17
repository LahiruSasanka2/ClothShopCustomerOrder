package lk.ijse.csco.business.custom;

import lk.ijse.csco.business.SuperBO;
import lk.ijse.csco.dto.ClothDTO;
import lk.ijse.csco.dto.CustomerDTO;

import java.util.List;

public interface ManageClothsBO extends SuperBO {

    List<ClothDTO> getCloths() throws Exception;

    boolean createCloth(ClothDTO dto) throws Exception;

    boolean updateCloth(ClothDTO dto) throws Exception;

    boolean deleteCloth(String customerID) throws Exception;

    ClothDTO findCloth(String id) throws Exception;
}
