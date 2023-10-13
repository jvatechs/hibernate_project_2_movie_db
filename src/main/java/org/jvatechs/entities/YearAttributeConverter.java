package org.jvatechs.entities;

import jakarta.persistence.AttributeConverter;

import java.time.Year;

public class YearAttributeConverter implements AttributeConverter<Year, Short> {
    @Override
    public Short convertToDatabaseColumn(Year attribute) {
        if (attribute != null) {
            return Short.parseShort(attribute.toString());
        }
        return null;
    }

    @Override
    public Year convertToEntityAttribute(Short dbData) {
        if (dbData != null) {
            return Year.of(dbData);
        }
        return null;
    }
}
