package com.blogging.blogapp.repositories;

import com.blogging.blogapp.models.Blogging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBloggingRepo extends JpaRepository<Blogging,Long> {
}
