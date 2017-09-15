package ${groupId}.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * <p>
 * Data model class
 *  </p>
 */
@Entity
public class MyPojoDataModel {
	
	@Id
	private Long id;
	
	/*
	 * TODO
	 * Add:
	 * - properties
	 * - getters + setters
	 * - equas + compareTo
	 * - toString
	 */
	
	public MyPojoDataModel() {
		// Default constructor
		super();
	}
	
	public MyPojoDataModel(final Long id) {
		// Default constructor
		super();
		this.id = id;
	}
	
}
