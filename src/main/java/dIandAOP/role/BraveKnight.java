package dIandAOP.role;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import dIandAOP.service.Quest;

import java.util.Stack;

public class BraveKnight {
    private Quest quest;
    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    public void emark(){
        quest.action();
    }

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/Knight.xml");
//        BraveKnight knight = context.getBean(BraveKnight.class);
//        knight.emark();
        String s=")(())()(()()";
        Stack<String> stack1 = new Stack<String>();

    }
}
