package com.example.copsboot.user;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class MobileTokenAttributeConverter implements AttributeConverter<MobileToken, String>{

    @Override
    public String convertToDatabaseColumn(MobileToken attribute) {
        return attribute.value();
    }

    @Override
    public MobileToken convertToEntityAttribute(String dbData) {
        return new MobileToken(dbData);
    }
    
}
