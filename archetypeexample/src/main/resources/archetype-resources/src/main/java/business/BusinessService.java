package ${groupId}.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${groupId}.model.MyPojoDataModel;
import ${groupId}.persistence.PersistenceService;

@Service
@Transactional
public class BusinessService {

	@Autowired
	private PersistenceService persistenceService;
	
	public MyPojoDataModel createEmployee(final Long id) {
		final MyPojoDataModel pojo = new MyPojoDataModel(id);
		persistenceService.createMyPojoDataModel(pojo);
		return pojo;
	}
	
	public MyPojoDataModel getMyPojoDataModelById(final String empId) {
		return persistenceService.getMyPojoDataModelById(empId);
	}
	
	/*
	 * TODO:
	 * Add persistence accesors if necessary
	 */
}
