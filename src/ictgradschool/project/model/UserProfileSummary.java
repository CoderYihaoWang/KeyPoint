package ictgradschool.project.model;

import java.io.Serializable;

public class UserProfileSummary implements Serializable {
    private int id;
    private String nickname;
    private String email;
    private String signature;
    private String avatar;
    private String description;


    public UserProfileSummary(int id, String nickname, String email, String signature, String avatar, String description) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.signature = signature;
        this.avatar = avatar;
        this.description = description;
    }

    public UserProfileSummary() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserProfileSummary{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", signature='" + signature + '\'' +
                ", avatar='" + avatar + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
