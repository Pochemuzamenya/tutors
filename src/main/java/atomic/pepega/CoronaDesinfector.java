package atomic.pepega;

public class CoronaDesinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room){
        announcer.announce("Начинаеим дезинфекцию, все вон!");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Заходите, все обратно!");
    }

    private void desinfect(Room room) {
        System.out.println("Корона уходи");
    }
}
