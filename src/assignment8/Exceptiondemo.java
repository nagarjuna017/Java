package assignment8;

class Userid extends Exception{
    public Userid(String str){
        super(str);
    }
};

class Password extends Exception{
    public Password(String str){
        super(str);
    }
};

class OTP extends Exception{
    public OTP(String str){
        super(str);
    }
};


class Exceptiondemo extends Exception{

    public void CheckDetails(String userid,String password,String otp)
            throws Userid, Password, OTP {

        if(userid.length()!=8)
        {
            throw new Userid("Exception caught . User Id should be of minimum length 8 ");
        }
        if(password.length()!=10){
            throw new Password("Exception caught . Password should be of minimum length of 10 ");
        }

        if(otp.length()!=6){
            throw new OTP("Otp should be a 6 digit number");
        }
    }
};

class MainClass {

    public static void main(String[] args) {

        try {
            Exceptiondemo exceptiondemo = new Exceptiondemo();
            exceptiondemo.CheckDetails("440245154","1234567890","456650");
        }
        catch(Userid | Password | OTP e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this is printed always irrespective of exception present or not.");
        }

    }

}
