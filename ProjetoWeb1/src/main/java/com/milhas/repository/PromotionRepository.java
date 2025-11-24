package com.milhas.repository;

import com.milhas.entity.PromotionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PromotionRepository extends JpaRepository<PromotionEntity, Long> {

    // Busca promoções ativas (dataFim >= hoje) para um programa específico
    List<PromotionEntity> findByProgPontosIdAndDataFimGreaterThanEqual(Long programaPontosId, LocalDate hoje);
}
