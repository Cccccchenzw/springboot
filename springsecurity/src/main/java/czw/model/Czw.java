package czw.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
@ConfigurationProperties(prefix = "czw")
public class Czw {
    private String name;
    @JsonIgnore
    private Integer number;
    private boolean boy;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Czw)) return false;
        Czw czw = (Czw) o;
        return boy == czw.boy && name.equals(czw.name) && number.equals(czw.number) && date.equals(czw.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, boy, date);
    }

    @Override
    public String toString() {
        return "Czw{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", boy=" + boy +
                ", date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isBoy() {
        return boy;
    }

    public void setBoy(boolean boy) {
        this.boy = boy;
    }

}
