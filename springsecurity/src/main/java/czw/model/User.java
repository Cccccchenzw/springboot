package czw.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * https://blog.csdn.net/Teng_is_a_littlebird/article/details/90691341?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522164802752016782248548110%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=164802752016782248548110&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v1~rank_v31_ecpm-2-90691341.142^v3^pc_search_result_cache,143^v4^control&utm_term=Illegal+overloaded+getter+method+with+ambiguous+type+for+property&spm=1018.2226.3001.4187
 * 我在springboot 整合修改spring security时，遇到一个java和mybatis映射冲突的bug。
 *报错的原因是因为类中同时出现了 isEnabled() 和 getEnabled()，如下：
 *解决办法是
 * 方法1.重命名isEnabled()，不要是is开头换成其他的，如：typeofEnabled()
 * (由于我上面isEnabled()是个@Override，显然方法1不行)
 * 方法2：删除getEnabled()这个方法，通过上面可以发现他们返回的值是一样的，那就可以去掉一个。
 *
 * */
public class User implements UserDetails {
    private Integer id;
    private String username;
    private String password;
    private Boolean enabled;
    private Boolean locked;
    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role:roles){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    记录问题并git
//    public Boolean getEnabled() {
//        return enabled;
//    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", locked=" + locked +
                ", roles=" + roles +
                '}';
    }
}
