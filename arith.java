/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sjnew;

/**
 *
 * @author Sulabh Jindal
 */
public class arith {
    double res;
    public double arithmat(double fnum,double snum,String opcode){
        if("+".equals(opcode) )
            res = fnum+snum;
        else if("-".equals(opcode) )
            res = fnum-snum;
        else if("*".equals(opcode) )
            res = fnum*snum;
        else if("/".equals(opcode) )
            res = fnum/snum;
        return res;
        
    }
 
    
}
