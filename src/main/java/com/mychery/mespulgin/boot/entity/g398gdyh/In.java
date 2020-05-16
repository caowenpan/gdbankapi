package com.mychery.mespulgin.boot.entity.g398gdyh;

import com.mychery.mespulgin.boot.entity.Head;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * Created by IT000289 on 2020/4/23.
 */
//请求报文
@XmlRootElement(name="In")  //表示In是一个根元素
public class In implements Serializable {
    //报文头
    @XmlElement
    private Head Head;

    //报文体
    @XmlElement
    private Body Body;

    @XmlTransient
    public Head getHead() {
        return Head;
    }

    public void setHead(com.mychery.mespulgin.boot.entity.Head head) {
        Head = head;
    }

    @XmlTransient
    public Body getBody() {
        return Body;
    }

    public void setBody(Body body) {
        Body = body;
    }
}
