package Controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class JaksonConvert {
    public static void main(String[] args)  throws IOException   {
        File file = new File("src/main/java/model/cat.json");
        ObjectMapper mapper = new ObjectMapper();

        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

        Cat cat = mapper.readValue(file, Cat.class);
        System.out.println("Cat == " + cat);
        System.out.println("jsonToPojo.getName() =  " + cat.getName());


    }
}

