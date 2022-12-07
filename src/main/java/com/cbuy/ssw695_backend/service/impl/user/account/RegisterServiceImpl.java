package com.cbuy.ssw695_backend.service.impl.user.account;

import com.cbuy.ssw695_backend.service.user.account.RegisterService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cbuy.ssw695_backend.mapper.UserMapper;
import com.cbuy.ssw695_backend.pojo.User;
import com.cbuy.ssw695_backend.service.user.account.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Map<String, String> register(String username, String password, String confirmedPassword) {
        Map<String, String> map = new HashMap<>();
        if (username == null) {
            map.put("error_message", "User Name cannot be Empty");
            return map;
        }
        if (password == null || confirmedPassword == null) {
            map.put("error_message", "Password cannot be empty");
            return map;
        }

        username = username.trim();
        if (username.length() == 0) {
            map.put("error_message", "User Name cannot be Empty");
            return map;
        }

        if (password.length() == 0 || confirmedPassword.length() == 0) {
            map.put("error_message", "User Name cannot be Empty");
        }

        if (username.length() > 100) {
            map.put("error_message", "Username cannot be longer than 100");
            return map;
        }

        if (password.length() > 100 || confirmedPassword.length() > 100) {
            map.put("error_message", "password cannot be longer then 100");
            return map;
        }

        if (!password.equals(confirmedPassword)) {
            map.put("error_message", "two passwords are different");
            return map;
        }

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        List<User> users = userMapper.selectList(queryWrapper);
        if (!users.isEmpty()) {
            map.put("error_message", "User name exists");
            return map;
        }

        String encodedPassword = passwordEncoder.encode(password);
        String photo = "https://cdn.shopify.com/s/files/1/0416/8083/0620/files/ecomm-CHGAL-Core2021_367x353px_01-HK_1000x.png?v=1614324461";
        User user = new User(null, username, encodedPassword, photo);
        userMapper.insert(user);

        map.put("error_message", "success");
        return map;
    }
}
