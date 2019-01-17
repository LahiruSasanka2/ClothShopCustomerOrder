package lk.ijse.csco.business.custom.impl;

import lk.ijse.csco.business.custom.ManageCategoryBO;
import lk.ijse.csco.dto.ClothCategoryDTO;

import java.util.List;

public class ManageCategoryBOImpl implements ManageCategoryBO {

    @Override
    public List<ClothCategoryDTO> getClothCategory() throws Exception {
        return null;
    }

    @Override
    public boolean createClothCategory(ClothCategoryDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateClothCategory(ClothCategoryDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteClothCategory(String customerID) throws Exception {
        return false;
    }

    @Override
    public ClothCategoryDTO findClothCategory(String id) throws Exception {
        return null;
    }
}
