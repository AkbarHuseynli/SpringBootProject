package com.example.repository;

import com.example.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>  {
//    @Query(value="select * from account where username = ?", nativeQuery=true)
//    Account findByUsername(String username);

//    @Query(value="select a from Account a where a.username =?1")
//    Account findByUsername(String username);


}
