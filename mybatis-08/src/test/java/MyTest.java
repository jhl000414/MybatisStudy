import com.hai.dao.BlogMapper;
import com.hai.pojo.Blog;
import com.hai.util.IDUtils;
import com.hai.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addInitBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        session.close();
    }

    @Test
    public void testselectBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title","Mybatis如此简单");
        map.put("author","狂神说");

        List<Blog> blogs = mapper.queryBlogIf(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();


    }

    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("name", "Java如此简单");
        List<Blog> blogs = mapper.queryBlogChoose(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void testUpdateBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title","动态SQL");
        map.put("author","秦疆");
        map.put("id","770f36ca6a174e0289c93a62e1dd3198");

        mapper.updateBlog(map);


        session.close();
    }
}



