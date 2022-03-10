package czw.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@ConfigurationProperties(prefix = "maria")
public class Maria {
    private String name;
    private boolean girl;
    private Integer money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGirl() {
        return girl;
    }

    public void setGirl(boolean girl) {
        this.girl = girl;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Maria)) return false;
        Maria maria = (Maria) o;
        return girl == maria.girl && name.equals(maria.name) && money.equals(maria.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, girl, money);
    }

    @Override
    public String toString() {
        return "Maria{" +
                "name='" + name + '\'' +
                ", girl=" + girl +
                ", money=" + money +
                '}';
    }
}
