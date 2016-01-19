package org.com.process;

import org.com.bean.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class LoginProcess {

	@Autowired
	public MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public boolean getLoginAuthroized(String username, String password) {

		System.out.println("password " + password);
		boolean flag = false;
		Login login = new Login();
		Query query = new Query();
		System.out.println("1111111111111");
		query.addCriteria(Criteria.where("username").is(username));
		query.addCriteria(Criteria.where("password").is(password));
		System.out.println("query " + query);
		login = (Login) mongoTemplate.findOne(query, Login.class);
		System.out.println("login >>>> "+login);
		if (!(login ==  null))
			flag = true;
		else
			flag = false;
		
		System.out.println(flag);

		return flag;
	}

}
