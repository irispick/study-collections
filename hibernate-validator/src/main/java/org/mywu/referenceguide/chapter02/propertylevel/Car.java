package org.mywu.referenceguide.chapter02.propertylevel;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

/**
 * 属性级约束：
 *      属性的getter方法必须注释，而不是它的setter方法。这样也可以约束没有setter方法的只读属性。
 *      使用属性访问策略访问要验证的值，即验证引擎通过属性访问器方法访问状态。
 *
 * 建议在一个类中使用字段注释或属性注释，不建议同时对字段及其附带的getter方法进行注释，因为这会导致对字段进行两次验证。
 */
public class Car {
    private String manufacturer;

    private boolean isRegistered;

    public Car(String manufacturer, boolean isRegistered) {
        this.manufacturer = manufacturer;
        this.isRegistered = isRegistered;
    }

    @NotNull
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @AssertTrue
    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
}
