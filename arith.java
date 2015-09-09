/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sjnew;
import sjnew.caculator;
/**
 *
 * @author Sulabh Jindal
 */
public class arith {
    caculator c = new caculator();
    public double arithmat(double fnum,double snum,String opcode){
        if("+".equals(opcode) )
            c.res = fnum+snum;
        else if("-".equals(opcode) )
            c.res = fnum-snum;
        else if("*".equals(opcode) )
            c.res = fnum*snum;
        else if("/".equals(opcode) )
            c.res = fnum/snum;
        return c.res;
        
    }
 
    
}
