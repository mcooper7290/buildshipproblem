package com.contoso.webapp;

import com.contoso.common.CommonTools;
import com.contoso.model.Person;

public class AppLoader {

	public void load() {
		new Person();
		new CommonTools();
	}
}
