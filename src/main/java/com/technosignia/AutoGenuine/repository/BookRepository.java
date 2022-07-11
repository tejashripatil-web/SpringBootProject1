package com.technosignia.AutoGenuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technosignia.AutoGenuine.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>
{

}
