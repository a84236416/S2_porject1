package 练习.练习1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public interface Utility {
    public  void  Test();
}
class FourWheeler implements Utility{
    @Override
    public void Test(){
        System.out.println("=============================");
    }
}
class Car extends FourWheeler{
    @Override
    public void Test(){
        System.out.println("================6666666666=======");
    }
    public void  a(){
        System.out.println("========555555555555============");
    }
}
class Bus extends  FourWheeler{
    @Override
    public void Test(){
        System.out.println("==========================77777777777======");
    }
}
class  Test222{
    public static void main(String[] args) {
        FourWheeler bus=new Bus();
        bus.Test();
    }
}