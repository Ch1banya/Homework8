package Homework8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements ActionListener {

    Integer num;
    public Action(Integer num) {
        this.num = num;
    }


    @Override
    public void actionPerformed (ActionEvent e) {
        num++;
        System.out.println(num);

    }
}

