package com.dh.Bootcamp.integration;

import com.dh.Bootcamp.dto.request.UserDTO;
import com.dh.Bootcamp.dto.request.UserODTO;
import com.dh.Bootcamp.service.UserService;
import com.dh.Bootcamp.service.contract.IUserService;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
@AutoConfigureMockMvc
public class UserIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectWriter writer;

    // antes de cada ejecucicon de un test vacia el cache de los datos en memoria
    // cada test tiene un estado inicial(como si fuera el priemro en ejecutarse) gracias a la anotacion
    @MockBean
    UserService userService;

    @Test
    void testHello() throws Exception {
        // Arrange
        UserODTO user1 = new UserODTO("123", "marco");
        UserODTO user2 = new UserODTO("456", "avila");
        List<UserODTO> users = new ArrayList<>();
        users.add(user2);
        users.add(user1);

        //fecha para payload
        LocalDate b = LocalDate.parse("14-12-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        String userJson = writer.writeValueAsString(users);
        System.out.println(userJson);

        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(userJson);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/users/user");

/*        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("/users/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content("asd");*/

        // Act & Assert
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(
                        expectedStatus,
                        expectedJson,
                        expectedContentType
                );
/*                .andExpect(expectedContentType)
                .andExpect(expectedJson)
                .andExpect(expectedStatus);*/

//        MockHttpServletRequestBuilder requestPath = MockMvcRequestBuilders.get("/a/{id}/b/{e}", 2, 3);
//
//        MockHttpServletRequestBuilder requestParam = MockMvcRequestBuilders.get("/a/b")
//                .param("id", "2");
//
//        MockHttpServletRequestBuilder requestPayload = MockMvcRequestBuilders
//                .post("/a/c")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(deleteS);
    }
}
