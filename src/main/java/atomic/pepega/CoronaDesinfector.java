package atomic.pepega;

public class CoronaDesinfector {

    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public void start(Room room){
        announcer.announce("Начинаеим дезинфекцию, все вон!");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Заходите, все обратно!");
    }

    private void desinfect(Room room) {
        System.out.println("Корона говно");
    }
}
