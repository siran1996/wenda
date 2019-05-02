package com.nowcoder.wenda.DAO;


import com.nowcoder.wenda.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    @Insert({"insert into "})
    int addUser(User user);
}
