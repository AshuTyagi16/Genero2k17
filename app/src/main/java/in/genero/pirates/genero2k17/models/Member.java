package in.genero.pirates.genero2k17.models;

/**
 * Created by Sasuke on 10/8/2017.
 */

public class Member {
    private String memberName;
    private int memberImage;
    private String memberDesignation;
    private String memberPhone;

    public String getMemberDesignation() {
        return memberDesignation;
    }

    public void setMemberDesignation(String memberDesognation) {
        this.memberDesignation = memberDesognation;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberImage() {
        return memberImage;
    }

    public void setMemberImage(int memberImage) {
        this.memberImage = memberImage;
    }
}
