package org.mywu.referenceguide.containerelement.set;

import javax.validation.Validator;
import java.util.HashSet;
import java.util.Set;

public class Car {

    private Set<String> parts = new HashSet<>();

    public void addPart(String part) {
        parts.add(part);
    }

}
