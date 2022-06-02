package reservation.f3ls.mapper;

import org.apache.ibatis.annotations.*;
import reservation.f3ls.model.Restaurant;

import java.util.List;

@Mapper
public interface RestaurantMapper {
//    第一个：创建UserDao.xml 和 UserDao.java时名称是为了和我们之前的知识保持一致。
//    在Mybatis中它把持久层的操作接口名称和映射文件也叫做：Mapper
//    所以：UserDao 和 UserMapper是一样的
//    第二个：在idea中创建目录的时候，它和包是不一样的
//    包在创建时：com.yuan.dao它是三级结构
//    目录在创建时：com.yuan.dao是一级目录
//    第三个：mybatis的映射配置文件位置必须和dao接口的包结构相同
//    第四个：映射配置文件的mapper标签namespace属性的取值必须是dao接口的全限定类名
//    第五个：映射配置文件的操作配置（select），id属性的取值必须是dao接口的方法名
//    第六个：当我们遵从了第三，四，五点之后，我们在开发中就无须再写dao的实现类
//
//    作者：测试员
//    链接：https://www.jianshu.com/p/1d51d0fa9555
//    来源：简书
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    @Select("SELECT * FROM Restaurant")
    List<Restaurant> selectAll();

    @Select("SELECT 8 FROM Restaurant WHERE Id = #{Id}")
    Restaurant selectById(Integer id);

    @Insert("INSERT INTO Restaurant (id, name) VALUES (#{id}, #{name})")
    int insertRestaurant(Restaurant restaurant);

    @Update("UPDATE Restaurant SET name=#{name}  WHERE id=#{id}")
    int updateRestaurant(Restaurant restaurant);

    @Delete("DELETE FROM Restaurant WHERE id=#{id}")
    int delete(Integer id);
}
