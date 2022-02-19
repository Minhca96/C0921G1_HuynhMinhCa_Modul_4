package vn.codegym.case_study_model_4.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study_model_4.model.Position;

@Repository
public interface IPositionRepository extends JpaRepository<Position, Long> {

}
