package io.github.ayechanaungthwin.java_basic.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class TableCreator<T> {

	private T object;
	
	public TableCreator(T tableName) {
		this.object = tableName;
	}
	
	public String getTableName() {
		return Java2DbmsNaming.column(object.getClass().getSimpleName());
	}
	
	public List<CustomField> getNameTypeValue(){
		@SuppressWarnings("unchecked")
		Class<T> theClass = (Class<T>) object.getClass();
		
        List<CustomField> data = new ArrayList<>();

        Field[] fields = theClass.getDeclaredFields();

        for(Field field:fields){
            if(Modifier.isPrivate(field.getModifiers())){
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
	
	public String getCreateTableQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE `");
		sb.append(this.getTableName());
		sb.append("`(");
		
		for (CustomField out: this.getNameTypeValue()) {
			sb.append("`");
			sb.append(out.getName());
			sb.append("` ");
			sb.append(TypeConverter.getDbmsType(out.getType()));
			if (out.getName().toLowerCase().equals("id")) {
				sb.append(" AUTO_INCREMENT NOT NULL, ");
				continue;
			}
			sb.append(", ");
		}
		sb.append(" PRIMARY KEY (`id`));");
		
		return sb.toString();
	}
}
