package org.jvatechs.entities;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RatingConverter implements AttributeConverter<Rating, String> {
    @Override
    public String convertToDatabaseColumn(Rating rating) {
        return rating.getValue();
    }

    @Override
    public Rating convertToEntityAttribute(String dataFromDb) {
        Rating[] values = Rating.values();
        for (Rating rating : values) {
            if(rating.getValue().equals(dataFromDb)) {
                return rating;
            }
        }
        return null;
    }
}
