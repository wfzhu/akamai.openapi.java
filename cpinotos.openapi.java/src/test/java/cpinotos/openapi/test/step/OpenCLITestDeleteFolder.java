package cpinotos.openapi.test.step;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import cpinotos.openapi.services.NetStorageAPI;


public class OpenCLITestDeleteFolder extends MyTestParameters {


	@Before
	public void before() {
		setNsapi(new NetStorageAPI(getHostname(), getEdgercFilePath1(), getApiClientNameDefault(), isDebug()));
	}


	@Test
	public void test() {
		LOGGER.info(String.format("delete %s", getNetStorageTestFolderPath()));
		assertTrue(getNsapi().doNetstorageDelete(getNetStorageTestFolderPath()));
	}

}
