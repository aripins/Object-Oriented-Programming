public class Member {
    int idMember;
    String name;
    String phone;
    String email;
    String address;

    public Member(int idMember, String name, String phone, String email, String address) {
        this.idMember = idMember;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "idMember=" + idMember +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
