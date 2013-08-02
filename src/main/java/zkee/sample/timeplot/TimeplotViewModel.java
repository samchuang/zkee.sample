package zkee.sample.timeplot;

import org.zkforge.timeplot.data.PlotDataSource;
import org.zkforge.timeplot.geometry.DefaultTimeGeometry;
import org.zkforge.timeplot.geometry.DefaultValueGeometry;
import org.zkforge.timeplot.geometry.TimeGeometry;
import org.zkforge.timeplot.geometry.ValueGeometry;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

public class TimeplotViewModel {

	private PlotDataSource plotDataSource;
	private ValueGeometry valueGeometry;
	private TimeGeometry timeGeometry;

	private TimeplotDisplayConfig displayConfig = TimeplotDisplayConfig.createDefaultConfig();

	@Init
	public void init() {
		plotDataSource = new PlotDataSource();
		plotDataSource.setDataSourceUri("/misc/immigration.txt");
		plotDataSource.setSeparator(" ");
		valueGeometry = new DefaultValueGeometry();
		valueGeometry.setGridColor("#000000");
		timeGeometry = new DefaultTimeGeometry();
		timeGeometry.setAxisLabelsPlacement("bottom");
	}

	@GlobalCommand("displayConfigUpdated")
	@NotifyChange("displayConfig") 
	public void onDisplayConfigChanged(@BindingParam("displayConfig") TimeplotDisplayConfig newConfig) {
		this.displayConfig = newConfig;
	}

	public PlotDataSource getPlotDataSource() {
		return plotDataSource;
	}

	public ValueGeometry getValueGeometry() {
		return valueGeometry;
	}

	public TimeGeometry getTimeGeometry() {
		return timeGeometry;
	}

	public TimeplotDisplayConfig getDisplayConfig() {
		return displayConfig;
	}
}
