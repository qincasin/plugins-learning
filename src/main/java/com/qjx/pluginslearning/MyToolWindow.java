package com.qjx.pluginslearning;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

/**
 * @author: qinjiaxing
 * @Date: 2022/9/22 23:01
 * @Description:
 */
public class MyToolWindow {
    private JPanel rootPanel;
    private JTextPane helloWorldTextPane;
    private JButton button1;

    public MyToolWindow(ToolWindow toolWindow){

    }

    public JPanel getContent(){
        return rootPanel;
    }
}

