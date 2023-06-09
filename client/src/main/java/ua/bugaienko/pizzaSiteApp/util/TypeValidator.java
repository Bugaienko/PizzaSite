package ua.bugaienko.pizzaSiteApp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ua.bugaienko.pizzaSiteApp.models.TypeIngredient;
import ua.bugaienko.pizzaSiteApp.services.IngredientService;
import ua.bugaienko.pizzaSiteApp.services.TypeService;

import java.util.Optional;

/**
 * @author Sergii Bugaienko
 */

@Component
public class TypeValidator implements Validator {


    private final TypeService typeService;

    @Autowired
    public TypeValidator(TypeService typeService) {
        this.typeService = typeService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return TypeIngredient.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        TypeIngredient newType = (TypeIngredient) target;

        Optional<TypeIngredient> resultByName = typeService.findByName(newType.getName());


        if (resultByName.isPresent()) {
            errors.rejectValue("name", "", "This name is already in use. Choose another");
        }

    }
}
