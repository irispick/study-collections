package org.mywu.referenceguide.chapter02.fieldlevel;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

/**
 * 字段级约束：
 *      当使用字段级约束时，使用字段访问策略来访问要验证的值。
 *      这意味着验证引擎直接访问实例变量，而不调用属性访问器方法。
 *
 *      约束可以应用于任何访问类型（共有、私有等）的字段。但是不支持对static字段的约束。
 */
public class Car {

    @NotNull
    private String manufacturer;

    @AssertTrue
    private boolean isRegistered;

    public Car(String manufacturer, boolean isRegistered) {
        this.manufacturer = manufacturer;
        this.isRegistered = isRegistered;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
}
