package proxyDesignPattern;

/**
 * Created by Dell Vostro 5459 on 1/12/2017.
 */
import java.util.*;

interface InternetAccess{
    void grantInternetAccess();
}
class RealInternetAccess implements InternetAccess{
    private String employeeName = null;
    public RealInternetAccess(String employeeName){
        this.employeeName = employeeName;
    }
    public void grantInternetAccess(){
        System.out.println("Internet Access granted for employee: " + this.employeeName);
    }
}
class ProxyInternetAccess implements InternetAccess{
    private RealInternetAccess realInternetAccess = null;
    private String employeeName = null;
    private EmployeeInformation employee = new EmployeeInformation();
    public ProxyInternetAccess(String employeeName, EmployeeInformation employeeInformation){
        this.employeeName = employeeName;
        employee = employeeInformation;
        realInternetAccess = new RealInternetAccess(this.employeeName);
    }
    public void grantInternetAccess(){
        Map<String, Integer> mapEmp = this.employee.getInformation();
        if(mapEmp.containsKey(this.employeeName)){
            if(checkRule(mapEmp.get(this.employeeName))){
                this.realInternetAccess.grantInternetAccess();
            }else{
                System.out.println("We can not granted Internet Access for this employee");
            }
        }else{
            System.out.println("Sorry this name is not exist !!!");
        }
    }
    private boolean checkRule(int levelEmployee){
        if(levelEmployee >= 4){
            return true;
        }else{
            return false;
        }
    }

}
class EmployeeInformation{
    private Map<String, Integer> employeeMap = new HashMap<>();
    public void fillMapEmp(){
        employeeMap.put("Tommy", 1);
        employeeMap.put("Micky", 2);
        employeeMap.put("Tom", 3);
        employeeMap.put("Jack", 4);
        employeeMap.put("Mary", 5);
        employeeMap.put("Jessica", 6);
    }
    public Map<String, Integer> getInformation(){
        return this.employeeMap;
    }
}
public class InternetAccessDemo {
    public static void main(String[] args){
        EmployeeInformation informationEmp = new EmployeeInformation();
        informationEmp.fillMapEmp();
        InternetAccess internetAccess = new ProxyInternetAccess("Cao xuan Quy", informationEmp);
        InternetAccess internetAccess1 = new ProxyInternetAccess("Jack", informationEmp);
        InternetAccess internetAccess2 = new ProxyInternetAccess("Mary", informationEmp);
        InternetAccess internetAccess3 = new ProxyInternetAccess("Tommy", informationEmp);
        internetAccess.grantInternetAccess();
        internetAccess1.grantInternetAccess();
        internetAccess2.grantInternetAccess();
        internetAccess3.grantInternetAccess();
    }
}
