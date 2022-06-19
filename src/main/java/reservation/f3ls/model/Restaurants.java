package reservation.f3ls.model;

public class Restaurants {
    private Integer id;
    private String name;

    private String description;

    private String picture;

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

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
