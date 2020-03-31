package com.github.prerna.propertyEditorPkg;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class PropertyBeanBean {
    private byte[] bytes;
    private Character character;         //CharacterEditor
    private Class cls;                   // ClassEditor
    private Boolean trueOrFalse;         // CustomBooleanEditor
    private List<String> stringList;     // CustomCollectionEditor
    private Date date;                   // CustomDateEditor
    private Float floatValue;            // CustomNumberEditor
    private File file;                   // FileEditor
    private InputStream stream;          // InputStreamEditor
    private Locale locale;               // LocaleEditor
    private Pattern pattern;             // PatternEditor
    private Properties properties;       // PropertiesEditor
    private String trimString;           // StringTrimmerEditor
    private URL url;                     //URLEditor

    public void setBytes(byte[] bytes) {
        System.out.println("setting byte : "+ Arrays.toString(bytes));
        this.bytes = bytes;
    }

    public void setCharacter(Character character) {
        System.out.println("Setting character: "+character);
        this.character = character;
    }

    public void setCls(Class cls) {
        System.out.println("Settring class : "+cls.getName());
        this.cls = cls;
    }

    public void setTrueOrFalse(Boolean trueOrFalse) {
        System.out.println("Setting Boolean : "+trueOrFalse);
        this.trueOrFalse = trueOrFalse;
    }

    public void setStringList(List<String> stringList) {
        System.out.println("Setting string list with size: "+ stringList.size());
        this.stringList = stringList;
    }

    public void setDate(Date date) {
        System.out.println("Setting Date : "+date);
        this.date = date;
    }

    public void setFloatValue(Float floatValue) {
        System.out.println("Setting float value: " + floatValue);
        this.floatValue = floatValue;
    }

    public void setFile(File file) {
        System.out.println("Setting File : "+file.getName());
        this.file = file;
    }

    public void setStream(InputStream stream) {
        System.out.println("Setting stream: " + stream);
        this.stream = stream;
    }

    public void setLocale(Locale locale) {
        System.out.println("Setting Locale : "+locale.getDisplayName());
        this.locale = locale;
    }

    public void setPattern(Pattern pattern) {
        System.out.println("Setting pattern: " + pattern);
        this.pattern = pattern;
    }

    public void setProperties(Properties properties) {
        System.out.println("Loaded "+properties.size()+" properties");
        this.properties = properties;
    }

    public void setTrimString(String trimString) {
        System.out.println("Setting trim string: " + trimString);
        this.trimString = trimString;
    }

    public void setUrl(URL url) {
        System.out.println("Setting URL : "+url.toExternalForm());
        this.url = url;
    }

    public static class customPropertyEditorRegistrar implements PropertyEditorRegistrar{

        @Override
        public void registerCustomEditors(PropertyEditorRegistry registry) {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/DD/YY");
            registry.registerCustomEditor(Date.class,new CustomDateEditor(dateFormatter, true));

            registry.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        }
    }

    public static void main(String[] args) throws Exception {
        File file = File.createTempFile("test" , "txt");
        file.deleteOnExit();

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/property.xml");
        context.refresh();

        PropertyBeanBean bean = (PropertyBeanBean) context.getBean("builtInSample");
        context.close();
    }

}
