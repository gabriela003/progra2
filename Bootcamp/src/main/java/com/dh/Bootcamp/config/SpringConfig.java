package com.dh.Bootcamp.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.convention.NamingConventions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
public class SpringConfig {
    @Bean
    public ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        //modelMapper.getConfiguration()
                // strategy for map inner objects
                //.setMatchingStrategy(MatchingStrategies.LOOSE)
                //.setSkipNullEnabled(true)
                //.setFieldMatchingEnabled(true)
                //.setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                //.setSourceNamingConvention(NamingConventions.JAVABEANS_MUTATOR);
        //AddMaps.addMaps(modelMapper);
        return modelMapper;
    }

    // Convertir objetos a JSON
    @Bean
    public ObjectMapper getObjectMapper(){
        return new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
                //.registerModule(new JSR310Module())
                .registerModule(new JavaTimeModule());
    }

    // Convertir objetos a JSON
    @Bean
    public ObjectWriter getObjectWriter(){
        return new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
                //.registerModule(new JSR310Module())
                .registerModule(new JavaTimeModule())
                .writer()
                .withDefaultPrettyPrinter();
    }

    // Validar parametros del controller tambien se necesita @validated a nivel de clase en el controller
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
