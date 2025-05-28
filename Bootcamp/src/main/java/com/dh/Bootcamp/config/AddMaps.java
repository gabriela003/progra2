package com.dh.Bootcamp.config;

import com.dh.Bootcamp.dto.request.UserDTO;
import com.dh.Bootcamp.model.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class AddMaps {

    public static void addMaps(ModelMapper modelMapper){
        TypeMap<User, UserDTO> propMap = modelMapper.createTypeMap(User.class, UserDTO.class, "UserToDTO");
        propMap.addMappings( mapper -> mapper.map(User::getFirstName, UserDTO::setName));
        propMap.addMapping(User::getFirstName, UserDTO::setName);
        modelMapper.createTypeMap(User.class, UserDTO.class)
                .addMapping(User::getFirstName, UserDTO::setName)
                ;

    }
}
