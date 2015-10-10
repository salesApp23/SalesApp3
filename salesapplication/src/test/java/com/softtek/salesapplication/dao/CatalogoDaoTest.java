package com.softtek.salesapplication.dao;

import java.util.ArrayList;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import com.softtek.salesapplication.dao.impl.CatalogoDao;
import com.softtek.salesapplication.dto.Catalogo;

public class CatalogoDaoTest extends SalesApplicationBaseDaoTest{

	@Autowired
	private CatalogoDao catalogoDao;
	
	public void setCatalogoDao(CatalogoDao catalogoDao){
		this.catalogoDao=catalogoDao;
	}
	
	@Test
	public void catalogoDaoTest(){
		
		ArrayList<Catalogo> catalogos = catalogoDao.getCatalogo();
		Assert.notNull(catalogos);
		Assert.isTrue(catalogos.size() > 0);
	
	}
}
