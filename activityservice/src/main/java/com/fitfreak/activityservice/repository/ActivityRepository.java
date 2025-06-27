package com.fitfreak.activityservice.repository;

import com.fitfreak.activityservice.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, String> {
}
