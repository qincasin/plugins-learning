//package com.qjx.pluginslearning;
//
//import com.intellij.openapi.actionSystem.AnAction;
//import com.intellij.openapi.actionSystem.AnActionEvent;
//import com.intellij.openapi.actionSystem.CommonDataKeys;
//import com.intellij.openapi.actionSystem.PlatformDataKeys;
//import com.intellij.openapi.project.Project;
//import com.intellij.openapi.ui.Messages;
//import com.intellij.psi.PsiFile;
//
///**
// * @author: qinjiaxing
// * @Date: 2022/9/22 22:39
// * @Description:
// */
//public class AppPlugin extends AnAction {
//
//    @Override
//    public void actionPerformed(AnActionEvent e) {
//        // TODO: insert action logic here
//        System.out.println("hello my plugin .... ");
//        Project project = e.getData(PlatformDataKeys.PROJECT);
//        PsiFile psiFile = e.getData(CommonDataKeys.PSI_FILE);
//        String classPath = psiFile.getVirtualFile().getPath();
////        Messages.showMessageDialog(project,"hahahah:"+classPath," hi: ", Messages.getInformationIcon());
//    }
//}
