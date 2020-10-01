public class RestrictObject {

private static RestrictObject object;

private static int count;

private RestrictObject() {

count++;
/*every object creation count must be incress by 1*/
System.out.println("Object created count =" + count);

}

public static RestrictObject getObject() {

if (count < 1) {

object = new RestrictObject();

}

return object;

}

}
