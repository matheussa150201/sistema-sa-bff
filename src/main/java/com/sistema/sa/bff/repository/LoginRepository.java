package com.sistema.sa.bff.repository;

import com.sistema.sa.bff.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

    @Query("FROM Login login " +
            "WHERE login.email = :email " +
            "AND login.senha = :senha ")
    public Login findOfLogin(@Param("email") String email,
                                  @Param("senha") String senha);
}
