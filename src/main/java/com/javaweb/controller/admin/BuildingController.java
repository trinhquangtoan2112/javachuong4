package com.javaweb.controller.admin;


import com.javaweb.enums.buildingType;
import com.javaweb.enums.districtCode;
import com.javaweb.model.dto.BuildingDTO;
import com.javaweb.model.response.BuildingSearchResponse;
import com.javaweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller(value = "buildingControllerOfAdmin")
public class BuildingController {

    @Autowired
    private IUserService iUserService;


    @RequestMapping(value = "/admin/building-list", method = RequestMethod.GET)
    public ModelAndView BuildingList(@ModelAttribute BuildingDTO buildingDTO, HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("admin/building/list");
        mav.addObject("modelSearch",buildingDTO);
        List<BuildingSearchResponse> responseList =new ArrayList<>();
        BuildingSearchResponse item =new BuildingSearchResponse();
        item.setId(3L);
        item.setName("2142121đ");
        item.setAddress("Ha Noi1242121214");
        item.setNumberOfBasement(12L);
        item.setManagerName("ưeqwrrwqwrqwrqwr");
        item.setManagerPhone("221421421421");
        responseList.add(item);
        mav.addObject("buildingList",responseList);
        mav.addObject("listStaffs",iUserService.getStaff());
        mav.addObject("districts", districtCode.type());
        mav.addObject("typeCode", buildingType.type());
        return mav;
    }
    @GetMapping(value = "/admin/building-edit")
    public ModelAndView EditBuilding(@ModelAttribute("buildingEdit") BuildingDTO buildingDTO,HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("admin/building/edit");

        mav.addObject("districts", districtCode.type());
        mav.addObject("typeCode", buildingType.type());
        return mav;
    }

    @GetMapping(value = "/admin/building-edit-{id}")
    public ModelAndView buildingEdit(@PathVariable("id") Long Id, HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("admin/building/edit");
BuildingDTO buildingDTO =new BuildingDTO();
buildingDTO.setId(Id);
        buildingDTO.setName("12442142142ss");
        mav.addObject("districts", districtCode.type());
        mav.addObject("typeCode", buildingType.type());
        mav.addObject("buildingEdit", buildingDTO);
        return mav;
    }
}
