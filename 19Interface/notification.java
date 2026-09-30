interface notifi{
    void message(String msg);
}
class sms implements notifi{
    public void message(String msg){
        System.out.println("otp is "+ msg);
    }
}
class whatsapp implements notifi{
    public void message(String msg){
        System.out.println("order placed id "+ msg);
    }
}
class gmail implements notifi{
    public void message(String msg){
        System.out.println("otp to login "+ msg);
    }
}
public class notification {
    public static void main(String[] args) {
        sms s=new sms();
        s.message("123");
        whatsapp w=new whatsapp();
        w.message("456");
        gmail g=new gmail();
        g.message("789");


    }
    
}
