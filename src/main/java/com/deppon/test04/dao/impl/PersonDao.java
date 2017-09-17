package com.deppon.test04.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.deppon.test04.dao.IPersonDao;

public class PersonDao implements IPersonDao {

	public void save() {
		System.out.println("------------from PersonDao.save()");
		System.out.println("------------from PersonDao.save()");
        List<String>  str = new ArrayList<String>();
       
        List<String>  list = Arrays.asList("1","2","3","4");
	}
}
