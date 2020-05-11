/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author quan
 */
public class HoaDon {
     HoaDonHeader header;
    ArrayList<CTHD> ds;

    protected HoaDon(Builder builder){
        this.header = builder.header;
        this.ds = builder.ds;
    }
    @Override
    public String toString(){
        String str = header.toString();
        for(CTHD cthd : ds){
            str += cthd.toString();
        }
        return str;
    }
    public static class Builder{
        HoaDonHeader header;
        ArrayList<CTHD> ds;
        public Builder(){
            this.ds = new ArrayList<>();
        }
        public Builder setHeader(HoaDonHeader header){
            this.header = header;
            return this;
        }
        public Builder addDSHD(CTHD ct){
            this.ds.add(ct);
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
