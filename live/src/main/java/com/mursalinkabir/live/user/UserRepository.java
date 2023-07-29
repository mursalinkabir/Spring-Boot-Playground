package com.mursalinkabir.live.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//here user is the model and Long is the data type of primary key
public interface UserRepository extends JpaRepository<User,Long> {
}
