package class19;

public class UserClass {
    String name;
    int mobileNumber;

    UserClass(String name,int mobileNumber){
        this.mobileNumber=mobileNumber;
        this.name=name;
    }
}

class UserInfo extends UserClass{
    String userAddress;
    UserInfo(String name, int mobileNumber,String userAddress) {
        super(name, mobileNumber);
        this.userAddress=userAddress;
    }

    void userDetails(){
        System.out.println("Name :"+name+" mobile number:"+mobileNumber+" address:"+userAddress);
    }
}
