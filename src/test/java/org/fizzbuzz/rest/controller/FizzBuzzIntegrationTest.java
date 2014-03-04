package org.fizzbuzz.rest.controller;

import org.fizzbuzz.domain.FizzBuzzService;
import org.fizzbuzz.dto.FizzBuzzResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class FizzBuzzIntegrationTest {
    MockMvc mockMvc;

    @InjectMocks
    FizzBuzzController controller;

    @Mock
    FizzBuzzService fizzBuzzService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        this.mockMvc = standaloneSetup(controller)
                .setMessageConverters(new MappingJackson2HttpMessageConverter()).build();
    }

    @Test
    public void correctGetShouldReturnHttpOK() throws Exception {

        when(fizzBuzzService.generateReply(anyList())).thenReturn(
                new FizzBuzzResponse());

        this.mockMvc.perform(
                get("/api/play/{numbers}", "123")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
