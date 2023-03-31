package com.fpt.user.mapper;

import com.fpt.common.dto.user.UserDto;
import com.fpt.user.entity.Retailer;
import com.fpt.user.entity.Role;
import com.fpt.user.entity.User;
import com.github.f4b6a3.uuid.UuidCreator;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserMapperTest {
    private final UserMapper mapper = Mappers.getMapper(UserMapper.class);

    @Test
    void sourceToDestination() {
        User source = new User();
        source.setUsername("123");
        source.setEmail("111");
        source.setPassword("222");
        source.setName("name");
        source.setBirthdate(LocalDate.now());
        source.setExpired(false);
        source.setLocked(false);
        source.setDisabled(false);
        source.setAddresses(Lists.newArrayList());
        source.setRole(new Role());
        source.setRetailer(new Retailer());
        source.setId(0L);
        source.setUuid(UuidCreator.getRandomBasedFast());
        source.setCreatedBy(UuidCreator.getRandomBasedFast());
        source.setUpdatedBy(UuidCreator.getRandomBasedFast());
        source.setCreatedTime(LocalDateTime.now());
        source.setUpdatedTime(LocalDateTime.now());

        UserDto destination = mapper.sourceToDestination(source);

        assertAll("Test fields",
            () -> {
                assertEquals(source.getName(), destination.getName());
                assertEquals(source.getEmail(), destination.getEmail());
            },
            () -> {
                assertEquals(source.getUuid(), destination.getUuid());
                assertEquals(source.getCreatedBy().toString(), destination.getCreatedBy());
                assertEquals(source.getUpdatedBy().toString(), destination.getUpdatedBy());
            },
            () -> {
                assertEquals(source.getBirthdate(), destination.getBirthdate());
                assertEquals(source.getCreatedTime(), destination.getUpdatedTime());
            }
        );
    }

    @Test
    void destinationToSource() {
        UserDto destination = new UserDto();
        destination.setUsername("joejoe");
        destination.setEmail("joana@google.com");
        destination.setName("joe brake");
        destination.setBirthdate(LocalDate.now());
        destination.setAddresses(Lists.newArrayList());
        destination.setUuid(UuidCreator.getRandomBasedFast());
        destination.setCreatedBy(UuidCreator.getRandomBasedFast().toString());
        destination.setUpdatedBy(UuidCreator.getRandomBasedFast().toString());
        destination.setCreatedTime(LocalDateTime.now());
        destination.setUpdatedTime(LocalDateTime.now());
        destination.setCreatedByUser(new UserDto());
        destination.setUpdatedByUser(new UserDto());

        User source = mapper.destinationToSource(destination);

        assertAll("",
            () -> {
                assertEquals(source.getName(), destination.getName());
                assertEquals(source.getEmail(), destination.getEmail());
            },
            () -> {
                assertEquals(source.getUuid(), destination.getUuid());
                assertEquals(source.getCreatedBy().toString(), destination.getCreatedBy());
                assertEquals(source.getUpdatedBy().toString(), destination.getUpdatedBy());
            },
            () -> {
                assertEquals(source.getBirthdate(), destination.getBirthdate());
                assertEquals(source.getCreatedTime(), destination.getCreatedTime());
            }
        );
    }
}
