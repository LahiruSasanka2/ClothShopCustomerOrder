package lk.ijse.csco.business.custom.impl;


import lk.ijse.csco.business.custom.ManageClothsBO;
import lk.ijse.csco.dto.ClothDTO;

import java.util.List;

public class ManageClothBOImpl implements ManageClothsBO {

    @Override
    public List<ClothDTO> getCloths() throws Exception {
        return null;
    }

    @Override
    public boolean createCloth(ClothDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateCloth(ClothDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCloth(String customerID) throws Exception {
        return false;
    }

    @Override
    public ClothDTO findCloth(String id) throws Exception {
        return null;
    }
}
