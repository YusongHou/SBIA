package com.example.SBIA.repository;

import com.example.SBIA.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author HouYusong
 * @date 2022/4/28 16:54
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);
}
