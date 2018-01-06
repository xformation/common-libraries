/**
 * 
 */
package com.synectiks.commons.converters;

import com.synectiks.commons.entities.dynamodb.Entity.Category;

/**
 * @author Rajesh
 */
public class CategoryConverter extends StringConverter<Category> {


	public CategoryConverter() {
		super(Category.class);
	}

	/*@Override
	//@Cacheable("Category")
	public String convert(Category object) {
		if (!IUtils.isNull(object)) {
			logger.debug("Category: " + object);
			if (!IUtils.isNullOrEmpty(object.getId())) {
				return object.getId();
			} else {
				Category cat = RepositoryUtils.loadCategory(object);
				if (!IUtils.isNull(cat) && !IUtils.isNullOrEmpty(cat.getId())) {
					return cat.getId();
				} else {
					logger.debug("Failed to load category object");
				}
			}
		}
		return super.convert(object);
	}

	@Override
	//@CachePut(key = "#Category.id", value = "Category")
	public Category unconvert(String str) {
		if (!IUtils.isNullOrEmpty(str)) {
			// First check in cache if found return it
			Category cat = RepositoryUtils.findCategoryById(str);
			if (!IUtils.isNull(cat)) {
				return cat;
			}
		}
		return super.unconvert(str);
	}*/

	
}
