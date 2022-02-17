package vn.codegym.case_study_model_4.model;

import javax.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Role.class)
    private Role roleId;
    @ManyToOne(targetEntity = User.class)
    private User userName;

    public UserRole() {
    }

    public UserRole(Long id) {
        this.id = id;
    }

    public UserRole(Long id, Role roleId, User userName) {
        this.id = id;
        this.roleId = roleId;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", userName=" + userName +
                '}';
    }
}
