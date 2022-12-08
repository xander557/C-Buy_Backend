package com.cbuy.ssw695_backend.controller.user.produce;

import com.cbuy.ssw695_backend.pojo.Produce;
import com.cbuy.ssw695_backend.service.user.produce.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetListController {
    @Autowired
    private GetListService getListService;

    @GetMapping("/user/produce/getlist/")
    public List<Produce> getList() {
        System.out.println("controller here");
        return getListService.getList();
    }
}
