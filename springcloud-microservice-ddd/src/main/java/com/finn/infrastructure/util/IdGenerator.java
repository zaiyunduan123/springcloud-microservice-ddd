package name.finn.infrastructure.util;

import java.util.UUID;

public class IdGenerator {

    public static String nextId(){
        return UUID.randomUUID().toString();
    }
}
