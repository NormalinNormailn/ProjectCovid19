package com.ita.covid.ProjectCovid19;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateInfoRepository extends JpaRepository<StateInfo,String> {

}
