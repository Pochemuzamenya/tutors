package atomic.pepega;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("atomic.pepega",
                new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);

        desinfector.start(new Room());
    }
}
