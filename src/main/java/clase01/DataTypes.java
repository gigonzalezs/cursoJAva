package clase01;

public class DataTypes {

    public static String getType(Object object) {
        String className = object.getClass().getSimpleName();
        return className;
    }

}
