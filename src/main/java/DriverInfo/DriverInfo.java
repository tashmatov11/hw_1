package DriverInfo;

public class DriverInfo {
    private int id;
    private String idDriver;
    private String driver;
    private String bus;

    public DriverInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(String idDriver) {
        this.idDriver = idDriver;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "DriverInfo{" +
                "id=" + id +
                ", idDriver='" + idDriver + '\'' +
                ", driver='" + driver + '\'' +
                ", bus='" + bus + '\'' +
                '}';
    }
}
