package Task03_03;

import java.util.ArrayList;
import java.util.HashMap;

public class MailBox extends HashMap {
    @Override
    public Object get(Object key) {
        Object value = super.get(key);
        return value == null ? new ArrayList() : value;
    }
}
