package reservation.f3ls.mapper;

import org.apache.ibatis.annotations.*;
import reservation.f3ls.model.Tables;


import java.util.List;

@Mapper
public interface ReservationMapper {
    /*
    1. find all reservations of one user by userId
    2. add a reservation of one user on a certain time in a day
    3. remove a reservation of one user
     */
    @Select("SELECT * FROM TABLES WHERE ID = #{userId}")
    List<Tables> findAllReservationByUserId(Integer userId);

    @Insert("INSERT INTO TABLES VALUES (#{tableId}, #{userId}, #{restaurantId}, date(#{date}), time(#{time}))")
    int addReservation(Integer tableId, Integer userId, Integer restaurantId, String date, String time);

    @Delete("DELETE FROM RESTAURANTS WHERE ID = #{tableId} AND USERID = #{userId} AND RESTAURANTID = #{restaurantId} AND DATE = date(#{date}) AND TIME = time(#{time})")
    int removeReservation(Integer tableId, Integer userId, Integer restaurantId, String date, String time);
}
