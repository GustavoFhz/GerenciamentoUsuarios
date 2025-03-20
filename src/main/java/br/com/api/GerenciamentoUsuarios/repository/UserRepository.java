package br.com.api.GerenciamentoUsuarios.repository;

import br.com.api.GerenciamentoUsuarios.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    boolean existsByEmail(String email); //Verifica se existe um usuário com esse e-mail no banco de dados
}
