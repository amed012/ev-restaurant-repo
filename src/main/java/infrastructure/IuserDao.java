package infrastructure;

import domain.User;
import org.springframework.data.repository.CrudRepository;

public interface IuserDao extends CrudRepository<User, Long> {

}
