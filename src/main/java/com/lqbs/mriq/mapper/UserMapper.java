package com.lqbs.mriq.mapper;



import com.lqbs.mriq.common.model.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> selectUsers();
}
