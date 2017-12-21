package cpinotos.openapi.test.step;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import cpinotos.openapi.OpenAPI;
import cpinotos.openapi.services.NetStorageAPI;

public class OpenCLITestDir extends MyTestParameters {
		
	@Before
	public void before() {
		setOpenAPI(new OpenAPI(getConfigPath(), getHost(), isDebug()));
		setNsapi(new NetStorageAPI(getOpenAPI()));
	}
	
	@Test
	public void test() throws Exception {
		LOGGER.info(String.format("dir %s", getNetStorageTestFolderPath()));
		assertTrue(getNsapi().doNetstorageDir(getNetStorageTestFolderPath(), false).getFile().get(1).getName().equals(getTestFileName()));
	}

}
