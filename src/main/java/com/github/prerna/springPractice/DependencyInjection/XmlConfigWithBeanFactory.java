package com.github.prerna.springPractice.DependencyInjection;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {
    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
 //   rdr.loadBeanDefinitions(new      ClassPathResource("spring/app-context.xml"));
    Oracle oracle = (Oracle) factory.getBean("oracle");
   // System.out.println(oracle.defineLife());
}
