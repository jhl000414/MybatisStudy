package com.hai.dao;

import com.hai.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBlog(Blog blog);

    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogIf2(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

}
