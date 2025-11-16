import com.FileParser.saveFileData.Model.User;
import com.FileParser.saveFileData.Repository.JPAInterfaces;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JPAInterfaces<User, Long> {

}
