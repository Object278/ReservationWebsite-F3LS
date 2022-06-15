package reservation.f3ls.model;

public class Restaurant {
    private Integer id;
    private String name;

    private Integer xCoordination;
    private Integer yCoordination;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getxCoordination() {
        return xCoordination;
    }

    public Integer getyCoordination() {
        return yCoordination;
    }

    public void setxCoordination(Integer xCoordination) {
        this.xCoordination = xCoordination;
    }

    public void setyCoordination(Integer yCoordination) {
        this.yCoordination = yCoordination;
    }
}
