package reservation.f3ls.model;

public class Tables {
    private Integer id;

    private Integer userId;

    private Integer restaurantId;

    private String date;

    private String time;

    public Integer getId() {
        return id;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
