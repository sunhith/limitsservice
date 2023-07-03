package com.limitsservice.config;

public class LimitConfiguration
{
    private int maximum;
    private int minimum;
    //no-argument constructor
    protected LimitConfiguration()
    {
    }
    //generating getters
    public int getMaximum()
    {
    return maximum;
    }
    public int getMinimum()
    {
    return minimum;
    }
    //genetrating constructor using fields
    public LimitConfiguration(int maximum, int minimum)
    {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    @Override
    public String toString() {
        return "LimitConfiguration{" +
            "maximum=" + maximum +
            ", minimum=" + minimum +
            '}';
    }
}
