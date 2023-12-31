package lesson20.repository;

import lesson20.domain.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, Long> {
    @Query("select a.role from UserRole a, User b where b.userName=?1 and a.userId=b.id")
    public List<String> findRoleByUserName(String userName);
}
