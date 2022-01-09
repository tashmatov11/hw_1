package AutoBaza;

public class AutoBaza {
    private int id;
    private String bus;
    private String driver;
    private String status;

    public AutoBaza() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "AutoBaza{" +
                "id=" + id +
                ", bus='" + bus + '\'' +
                ", driver='" + driver + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
