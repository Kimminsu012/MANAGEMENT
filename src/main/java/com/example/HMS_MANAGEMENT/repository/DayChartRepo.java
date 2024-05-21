package com.example.HMS_MANAGEMENT.repository;


import com.example.HMS_MANAGEMENT.entity.DayChartEntity;
import net.bytebuddy.asm.Advice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public interface DayChartRepo extends JpaRepository<DayChartEntity, Long> {

    Optional<DayChartEntity> findByDate(LocalDate date);
}