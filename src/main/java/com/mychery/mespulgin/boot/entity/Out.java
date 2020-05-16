package com.mychery.mespulgin.boot.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * Created by IT000289 on 2020/4/24.
 */
//应答报文
@XmlRootElement(name="Out")  //表示Out是一个根元素
public class Out implements Serializable
{
    //报文头
    @XmlElement
    private Head Head;

    //报文体
    @XmlElement
    private Body2 Body;

    @XmlTransient
    public Head getHead() {
        return Head;
    }

    public void setHead(Head head) {
        Head = head;
    }

    @XmlTransient
    public Body2 getBody2() {
        return Body;
    }

    public void setBody2(Body2 body2) {
        Body = body2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Out{");
        sb.append("Head=").append(Head);
        sb.append(", Body=").append(Body);
        sb.append('}');
        return sb.toString();
    }
}
