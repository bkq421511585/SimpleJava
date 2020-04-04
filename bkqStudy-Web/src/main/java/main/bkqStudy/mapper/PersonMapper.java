package main.bkqStudy.mapper;

import main.bkqStudy.entity.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {
    @Select("select * from person where id = #{id}")
    Person findPersonById(@Param("id") int id);

    @Insert("insert into person (name,sex) values (#{person.name},#{person.sex})")
    int insertPerson(@Param("user") Person person);

    @Update("update person set name = #{name} where id = #{id}")
    Person updatePersonById(@Param("id") int id, @Param("name") String name);

    @Delete("delete from person where id = #{id}")
    Person deletePersonById(@Param("id") int id);

    Person Sel(int id);
}