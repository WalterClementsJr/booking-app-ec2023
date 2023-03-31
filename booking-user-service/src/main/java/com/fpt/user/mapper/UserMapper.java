package com.fpt.user.mapper;

import com.fpt.common.dto.user.UserDto;
import com.fpt.user.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDto sourceToDestination(User source);
    User destinationToSource(UserDto destination);
}
