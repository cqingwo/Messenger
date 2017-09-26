import com.cqwo.core.domain.UserInfo;
import com.cqwo.core.helper.FileHelper;
import com.cqwo.strategy.rdbs.service.UserService;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */
public class test {
    @Test
    public void UserTest() throws IOException {
        //UserInfo u = new UserInfo("14444444444", "e10adc3949ba59abbe56e057f20f883e");
        //UserService userService = new UserService();
        //System.out.println( userService.GetUserInfoByMobileAndPwd(u));

        File file = new File("D:\\Workspaces\\Messenger\\Strategies\\Strategy.RDBS\\src\\main\\java\\com\\cqwo\\strategy\\rdbs\\dao");
        FileHelper.list(file);
    }
    @Test
    public void Userlist()throws IOException{
        UserService userService = new UserService();
        List<UserInfo> list = userService.GetUserList(2,1,"","");
        System.out.println(list);
    }
}
