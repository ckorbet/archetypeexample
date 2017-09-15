package ${groupId}.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ${groupId}.model.MyPojoDataModel;

/**
 * <p>
 * Database access layer
 * </p>
 */
@Repository
public class PersistenceService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void createMyPojoDataModel(final MyPojoDataModel employee) {
		entityManager.persist(employee);
	}
	
	public MyPojoDataModel getMyPojoDataModelById(final String empId) {
		return entityManager.find(MyPojoDataModel.class, empId);
	}
	
	/*
	 * TODO:
	 * Add database operations if necessasry
	 */
	
}
