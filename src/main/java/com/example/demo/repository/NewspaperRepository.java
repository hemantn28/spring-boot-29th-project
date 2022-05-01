package com.example.demo.repository;

import com.example.demo.model.Newspaper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewspaperRepository extends JpaRepository<Newspaper, Integer> {
}
