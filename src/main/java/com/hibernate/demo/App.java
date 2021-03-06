package com.hibernate.demo;

import com.hibernate.demo.model.Answer;
import com.hibernate.demo.model.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory=meta.getSessionFactoryBuilder().build();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();

        Answer ans1=new Answer();
        ans1.setAnswerName("Java is a programming language");
        ans1.setPostedBy("Ravi Malik");

        Answer ans2=new Answer();
        ans2.setAnswerName("Java is a platform");
        ans2.setPostedBy("Sudhir Kumar");

        Question question1=new Question();
        question1.setQname("What is Java?");
        ArrayList<Answer> list1=new ArrayList<Answer>();
        list1.add(ans1);
        list1.add(ans2);
        question1.setAnswers(list1);

        Answer ans3=new Answer();
        ans3.setAnswerName("Servlet is an Interface");
        ans3.setPostedBy("Jai Kumar");

        Answer ans4=new Answer();
        ans4.setAnswerName("Servlet is an API");
        ans4.setPostedBy("Arun");

        Question question2=new Question();
        question2.setQname("What is Servlet?");
        ArrayList<Answer> list2=new ArrayList<Answer>();
        list2.add(ans3);
        list2.add(ans4);
        question2.setAnswers(list2);
        session.persist(question1);
        session.persist(question2);

        t.commit();
        session.close();
    }
}
