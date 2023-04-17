package dio.aula.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "user_id")

    private  Integer Id;
    @Column(length = 50, nullable = false)
  private   String name;
    @Column(length = 20, nullable = false)
  private   String UserName;
    @Column(length = 100, nullable = false)
  private   String passaword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassaword() {
        return passaword;
    }

    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", UserName='" + UserName + '\'' +
                ", passaword='" + passaword + '\'' +
                '}';
    }
}
