package com.j1p3ter.userserver.domain.repository;

import com.j1p3ter.userserver.domain.model.RefreshToken;
import com.j1p3ter.userserver.infrastructure.repository.QueryDslRefreshTokenRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long>, QueryDslRefreshTokenRepository {
}
