package com.study.pattern.prototype.deep;

import com.study.pattern.prototype.JingGuBang;
import com.study.pattern.prototype.Monkey;
import lombok.Data;

import java.io.*;
import java.util.Date;

@Data
public class SunWuKong extends Monkey implements Cloneable, Serializable{

    private JingGuBang jingGuBang;

    public SunWuKong() {
        this.setBirthday(new Date());
        this.jingGuBang = new JingGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepCloneable();
    }

    /**
     * 深克隆
     * @return
     */
    public Object deepCloneable() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        SunWuKong sunWuKong = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            sunWuKong = (SunWuKong) ois.readObject();
            sunWuKong.setBirthday(new Date());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sunWuKong;
    }
}
