package cn.net.guu.security.model;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
public class User implements UserDetails{
    
	private Integer userId;

    private String username;

    private String password;

    private String account;

    private String userDesc;

    private String userDuty;

    private String subSystem;

    private String userDept;

    private Boolean issys;
    
    
    private  Collection<GrantedAuthority> authorities; //权限集合   

    private  boolean accountNonExpired;  //是否过期
    private  boolean accountNonLocked;  //是否锁住
    private  boolean credentialsNonExpired; 
    private boolean enabled; //是否可用
    
    
    /**
     * Ĭ�Ͽչ��췽��
     * @author xrz
     * @return
     */
    
    public User(){
    	
    }
    
    
    public User(String userName,String password,boolean enabled,boolean accountNonExpired
    		,boolean accoutNonLocked,boolean credentailsNonExpired,Collection<GrantedAuthority> authorities)
    {
    	this.username = userName;
    	this.password = password;
    	this.enabled = enabled;
    	this.accountNonExpired = accountNonExpired;
    	this.accountNonLocked = accoutNonLocked;
    	this.credentialsNonExpired = credentailsNonExpired;
    	this.authorities =  authorities;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    public String getUserDuty() {
        return userDuty;
    }

    public void setUserDuty(String userDuty) {
        this.userDuty = userDuty == null ? null : userDuty.trim();
    }

    public String getSubSystem() {
        return subSystem;
    }

    public void setSubSystem(String subSystem) {
        this.subSystem = subSystem == null ? null : subSystem.trim();
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept == null ? null : userDept.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getIssys() {
        return issys;
    }

    public void setIssys(Boolean issys) {
        this.issys = issys;
    }
    
    

	public void setAuthorities(Set<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}
	
	// 获取当前登录用户详细信息必须重写hashCode和equals方法
		public int hashCode() {
			return this.getUsername().hashCode();
		}

		public boolean equals(Object object) {
			boolean flag = false;
			if (object instanceof UserDetails) {
				UserDetails user = (UserDetails) object;
				if (user.getUsername().equals(this.getUsername()))
					flag = true;
			}
			return flag;
		}
}