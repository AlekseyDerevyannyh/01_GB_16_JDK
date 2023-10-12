package task4;

public class NightClub<T extends Person> {
    private T[] community;

    public NightClub(T[] community) {
        this.community = community;
    }

    public void partyForAll() {
        for (T t : community) {
            t.haveRest();
        }
    }
}
