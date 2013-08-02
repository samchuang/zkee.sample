package zkee.sample.timeplot;

import java.util.Collections;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.Command;


public class TimeplotConfigViewModel {

	private TimeplotDisplayConfig displayConfig = TimeplotDisplayConfig.createDefaultConfig();

	public TimeplotDisplayConfig getDisplayConfig() {
		return displayConfig;
	}
	
//	@Command("displayConfigUpdated")
//	public void onDisplayConfigUpdated() {
//		BindUtils.postGlobalCommand(null, null, "displayConfigUpdated", 
//				Collections.<String, Object>singletonMap("displayConfig", displayConfig.copy()));
//	}
}
