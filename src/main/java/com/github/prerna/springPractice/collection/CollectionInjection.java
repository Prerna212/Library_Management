package com.github.prerna.springPractice.collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.annotation.Resource;

@Service("injectCollection")
public class CollectionInjection {
    @Resource(name= "map")
    private Map<String, Object> map;
    @Resource(name="props")
    private Properties props;
    @Resource(name="list")
    private List list;
    @Resource(name="set")
    private Set set;

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/collection-context.xml");
        context.refresh();

        CollectionInjection instance = (CollectionInjection) context.getBean("injectCollection");
        instance.displayInfo();
    }

    public void displayInfo(){
        System.out.println("Map :");
        map.entrySet().stream().forEach(e -> System.out.println("key: " +e.getKey() + "value: "+ e.getValue()));
        System.out.println("properties :");
        props.entrySet().stream().forEach(e -> System.out.println("key: "+e.getKey() + "value: "+ e.getValue()));
        System.out.println("Set :");
        set.forEach(obj -> System.out.println("Value: "+ obj));
        System.out.println("List :");
        list.forEach(obj -> System.out.println("Value: "+obj));
    }

//    @Autowired
    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

//    @Autowired
    public void setProps(Properties props) {
        this.props = props;
    }

//    @Autowired
    public void setList(List list) {
        this.list = list;
    }

//    @Autowired
    public void setSet(Set set) {
        this.set = set;
    }
}
