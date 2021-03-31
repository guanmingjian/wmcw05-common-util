package cn.oreo5.entity.PO;

import java.util.List;

public class Admin {
    private Integer id;

    private String name;

    private String password;

    private String email;

    private List<Role> roleList;

    private String status;

    private String registerTime;

    public Admin() {
    }

    public Admin(Integer id, String name, String password, String email, String status, String registerTime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.status = status;
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", roleList=" + roleList +
                ", status='" + status + '\'' +
                ", registerTime='" + registerTime + '\'' +
                '}';
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }
}