package test;

import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2016/12/2.
 */
public interface BlogMapper {

    @Select("SELECT * FROM t_blog WHERE id = #{id}")
    Blog selectBlog(int id);
}
