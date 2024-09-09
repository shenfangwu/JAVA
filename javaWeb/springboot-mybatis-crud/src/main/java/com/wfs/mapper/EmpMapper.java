package com.wfs.mapper;

import com.wfs.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

/**
 * 定义与数据库交互的方法
 */
@Mapper
public interface EmpMapper {
    // 1.1 根据主键删除数据
    @Delete("Delete from emp where id = #{id}")
    public void delete(Integer id);
    // 1.2 批量删除
    public void deleteByIds(@Param("ids") List<Integer> ids);
    // 2 新增
    @Options(keyProperty = "id", useGeneratedKeys = true)
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values(#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    public void insert(Emp emp);

    // 3 更新
    /**
     * 3.1静态更新员工信息
     * @param emp
     */
    @Update("update emp set username=#{username}, name=#{name}, gender=#{gender}, image=#{image}, job=#{job}, entrydate=#{entrydate}, " +
                        "dept_id=#{deptId}, update_time=#{updateTime} where id=#{id}")
          public void update1(Emp emp);
    /**
     * 3.2动态更新员工信息
     * @param emp
     */
    public void update2(Emp emp);
    // 4 根据id查询
    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id);
    // 5 根据条件查询
    // @Select("select * from emp where name like concat('%', #{name}, '%') and gender = #{gender} and entrydate between #{begin} and #{end} order by update_time desc")
    List<Emp> list(@Param("name") String name, @Param("gender") Short gender,
                   @Param("begin") LocalDate begin, @Param("end") LocalDate end);
}
