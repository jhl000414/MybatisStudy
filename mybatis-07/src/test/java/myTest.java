import com.hai.dao.TeacherMapper;
import com.hai.pojo.Teacher;
import com.hai.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class myTest {
    @Test
    public void selectTeacher(){
        SqlSession session = MybatisUtils.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher1();
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher);
        }

        session.close();

    }

    @Test
    public void testGetTeacher(){
        SqlSession session = MybatisUtils.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher.getName());
        System.out.println(teacher.getStudents());
        session.close();
    }

    @Test
    public void testGetTeacher2(){
        SqlSession session = MybatisUtils.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2.getName());
        System.out.println(teacher2.getStudents());

        session.close();
    }
}
