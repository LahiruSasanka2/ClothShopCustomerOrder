package lk.ijse.csco.business.custom;

import lk.ijse.csco.business.SuperBO;
import lk.ijse.csco.dto.ClothCategoryDTO;

import java.util.List;

public interface ManageCategoryBO  extends SuperBO {

    List<ClothCategoryDTO> getClothCategory() throws Exception;

    boolean createClothCategory(ClothCategoryDTO dto) throws Exception;

    boolean updateClothCategory(ClothCategoryDTO dto) throws Exception;

    boolean deleteClothCategory(String customerID) throws Exception;

    ClothCategoryDTO findClothCategory(String id) throws Exception;
}
