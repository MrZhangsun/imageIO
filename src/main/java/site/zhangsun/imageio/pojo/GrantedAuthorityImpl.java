package site.zhangsun.imageio.pojo;

import org.springframework.security.core.GrantedAuthority;

/**
 * @program: {Project_name}
 * @description:
 * @author: {}
 */
public class GrantedAuthorityImpl implements GrantedAuthority {

    private String authority;

    @Override
    public String getAuthority() {
        return this.authority;
    }

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

}
