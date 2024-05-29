package org.mywu.referenceguide.containerelement.set;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class CarTest {
    private static Validator validator;

    @BeforeClass
    public static void setUpValidator() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @Test
    public void testContainerSet() {
        Car car = new Car();
        car.addPart("Wheel");
        car.addPart(null);

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        System.out.println(constraintViolations.size());
        ConstraintViolation<Car> constraintViolation = constraintViolations.iterator().next();
        System.out.println(constraintViolation.getMessage());
        System.out.println(constraintViolation.getPropertyPath().toString());
    }
}
