package com.mychery.mespulgin.boot.entity.g397gdyh;

/**
 * Created by IT000289 on 2020/4/23.
 */

import com.mychery.mespulgin.boot.entity.Head;

/**
 * 该类暂时没用到
 */
public class G397Input
{
    private Body body;
    private Head head;
    private In in;
    private LIST_OBJ list_obj;

    public Body getBody() {

        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public In getIn() {
        return in;
    }

    public void setIn(In in) {
        this.in = in;
    }

    public LIST_OBJ getList_obj() {
        return list_obj;
    }

    public void setList_obj(LIST_OBJ list_obj) {
        this.list_obj = list_obj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("G397Input{");
        sb.append("body=").append(body);
        sb.append(", head=").append(head);
        sb.append(", in=").append(in);
        sb.append(", list_obj=").append(list_obj);
        sb.append('}');
        return sb.toString();
    }
}
