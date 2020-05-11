/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author quan
 */
public class MyStringBuilder {
    String str;
    public MyStringBuilder(String str){
        this.str = str;
    }
    public MyStringBuilder addString(String s){
        str += s;
        return this;
    }
    public MyStringBuilder addFloat(float f){
        str += f;
        return this;
    }
    public MyStringBuilder addbool(boolean b){
        str += b;
        return this;
    }
    @Override
    public String toString(){
        return str;
    }
}
