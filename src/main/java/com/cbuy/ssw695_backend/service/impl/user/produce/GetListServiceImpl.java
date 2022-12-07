package com.cbuy.ssw695_backend.service.impl.user.produce;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cbuy.ssw695_backend.mapper.ProduceMapper;
import com.cbuy.ssw695_backend.pojo.Produce;
import com.cbuy.ssw695_backend.service.user.produce.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetListServiceImpl implements GetListService {
    @Autowired
    private ProduceMapper produceMapper;

    @Override
    public List<Produce> getList() {
//        UsernamePasswordAuthenticationToken authenticationToken =
//                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
//        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
//        User user = loginUser.getUser();

//        QueryWrapper<Produce> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq;

        return produceMapper.selectList(null);
    }
}
