/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//piyush yadav ne change kiya hai
package arraydemo;

/**
 *This has been modified by Piyush 23 Jan at 12:47pm
 * @author Ronak
 */
public class Student {
    private int sid;
    private String sname;
    private String Address;

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }
    

    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
    

    
    
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    
    
    
}
