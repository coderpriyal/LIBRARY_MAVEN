package com.example.LibraryManagement;

public class Member {
    private String memberId;
    private String name;

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Member [memberId=" + memberId + ", name=" + name + "]";
    }
}
