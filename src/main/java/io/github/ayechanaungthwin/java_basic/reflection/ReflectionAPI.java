package io.github.ayechanaungthwin.java_basic.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class ReflectionAPI {

	public static List<CustomField> getPrivateFields(Object object){
		Class<?> theClass = object.getClass();
		
        List<CustomField> data = new ArrayList<>();

        Field[] fields = theClass.getDeclaredFields();

        for(Field field:fields){
            if(Modifier.isPrivate(field.getModifiers())){
            	//System.out.println(field.getType().getSimpleName());
            	Object value = null;
                field.setAccessible(true);
            	try {
					value = field.get(object);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	data.add(new CustomField(
            			field.getName(), 
            			field.getType().getSimpleName(), 
            			value));
            }
        }
        return data;
    }
}
