package data;

import org.joda.time.LocalTime;

/**
 * 
 * @author Jernej
 *
 */
public class WeatherDataRecord {
	// Properties
	// Meta data.
	private int archiveInterval;
	private int iconFlags;
	private LocalTime time;
	private Integer numwindSamples;
	
	// Meteorological data.
	private Double outTemp;
	private Double maxOutTemp;
	private Double minOutTemp;
	private Double inTemp;
	private Double inHumidity;
	private Double precipitation;
	private Double maxPrecipitationRate;
	private Double windSpeed;
	private Double maxWindSpeed;
	private Double windDirection;
	private Double maxWindDirection;
	private Double solarRad;
	private Double maxSolarRad;
	private Double UV;
	private Double maxUV;
	private Double[] leafTemp = new Double[4];
	private Double extraRad;
	private Double[] newSensors = new Double[6];
	private Integer forecast;
	private Double ET;
	private Double[] soilTemp = new Double[6];
	private Double[] soilMoisture = new Double[6];
	private Double[] leafWetness = new Double[4];
	private Double[] extraTemp = new Double[7];
	private Double[] extraHum = new Double[7];
	
	/**
	 * Empty constructor.
	 */
	public WeatherDataRecord() {
		super();
	}
	
	/**
	 * Constructor for all the fields.
	 * 
	 * @param archiveInterval
	 * @param iconFlags
	 * @param time
	 * @param numwindSamples
	 * @param outTemp
	 * @param maxOutTemp
	 * @param minOutTemp
	 * @param inTemp
	 * @param inHumidity
	 * @param precipitation
	 * @param maxPrecipitationRate
	 * @param windSpeed
	 * @param maxWindSpeed
	 * @param windDirection
	 * @param maxWindDirection
	 * @param solarRad
	 * @param maxSolarRad
	 * @param uV
	 * @param maxUV
	 * @param leafTemp
	 * @param extraRad
	 * @param newSensors
	 * @param forecast
	 * @param eT
	 * @param soilTemp
	 * @param soilMoisture
	 * @param leafWetness
	 * @param extraTemp
	 * @param extraHum
	 */
	public WeatherDataRecord(int archiveInterval, int iconFlags,
			LocalTime time, Integer numwindSamples, Double outTemp,
			Double maxOutTemp, Double minOutTemp, Double inTemp,
			Double inHumidity, Double precipitation,
			Double maxPrecipitationRate, Double windSpeed, Double maxWindSpeed,
			Double windDirection, Double maxWindDirection, Double solarRad,
			Double maxSolarRad, Double uV, Double maxUV, Double[] leafTemp,
			Double extraRad, Double[] newSensors, Integer forecast, Double eT,
			Double[] soilTemp, Double[] soilMoisture, Double[] leafWetness,
			Double[] extraTemp, Double[] extraHum) {
		super();
		this.archiveInterval = archiveInterval;
		this.iconFlags = iconFlags;
		this.time = time;
		this.numwindSamples = numwindSamples;
		this.outTemp = outTemp;
		this.maxOutTemp = maxOutTemp;
		this.minOutTemp = minOutTemp;
		this.inTemp = inTemp;
		this.inHumidity = inHumidity;
		this.precipitation = precipitation;
		this.maxPrecipitationRate = maxPrecipitationRate;
		this.windSpeed = windSpeed;
		this.maxWindSpeed = maxWindSpeed;
		this.windDirection = windDirection;
		this.maxWindDirection = maxWindDirection;
		this.solarRad = solarRad;
		this.maxSolarRad = maxSolarRad;
		UV = uV;
		this.maxUV = maxUV;
		this.leafTemp = leafTemp;
		this.extraRad = extraRad;
		this.newSensors = newSensors;
		this.forecast = forecast;
		ET = eT;
		this.soilTemp = soilTemp;
		this.soilMoisture = soilMoisture;
		this.leafWetness = leafWetness;
		this.extraTemp = extraTemp;
		this.extraHum = extraHum;
	}

	/**
	 * @return the archiveInterval
	 */
	public int getArchiveInterval() {
		return archiveInterval;
	}

	/**
	 * @param archiveInterval the archiveInterval to set
	 */
	public void setArchiveInterval(int archiveInterval) {
		this.archiveInterval = archiveInterval;
	}

	/**
	 * @return the iconFlags
	 */
	public int getIconFlags() {
		return iconFlags;
	}

	/**
	 * @param iconFlags the iconFlags to set
	 */
	public void setIconFlags(int iconFlags) {
		this.iconFlags = iconFlags;
	}

	/**
	 * @return the time
	 */
	public LocalTime getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(LocalTime time) {
		this.time = time;
	}

	/**
	 * @return the numwindSamples
	 */
	public Integer getNumwindSamples() {
		return numwindSamples;
	}

	/**
	 * @param numwindSamples the numwindSamples to set
	 */
	public void setNumwindSamples(Integer numwindSamples) {
		this.numwindSamples = numwindSamples;
	}

	/**
	 * @return the outTemp
	 */
	public Double getOutTemp() {
		return outTemp;
	}

	/**
	 * @param outTemp the outTemp to set
	 */
	public void setOutTemp(Double outTemp) {
		this.outTemp = outTemp;
	}

	/**
	 * @return the maxOutTemp
	 */
	public Double getMaxOutTemp() {
		return maxOutTemp;
	}

	/**
	 * @param maxOutTemp the maxOutTemp to set
	 */
	public void setMaxOutTemp(Double maxOutTemp) {
		this.maxOutTemp = maxOutTemp;
	}

	/**
	 * @return the minOutTemp
	 */
	public Double getMinOutTemp() {
		return minOutTemp;
	}

	/**
	 * @param minOutTemp the minOutTemp to set
	 */
	public void setMinOutTemp(Double minOutTemp) {
		this.minOutTemp = minOutTemp;
	}

	/**
	 * @return the inTemp
	 */
	public Double getInTemp() {
		return inTemp;
	}

	/**
	 * @param inTemp the inTemp to set
	 */
	public void setInTemp(Double inTemp) {
		this.inTemp = inTemp;
	}

	/**
	 * @return the inHumidity
	 */
	public Double getInHumidity() {
		return inHumidity;
	}

	/**
	 * @param inHumidity the inHumidity to set
	 */
	public void setInHumidity(Double inHumidity) {
		this.inHumidity = inHumidity;
	}

	/**
	 * @return the precipitation
	 */
	public Double getPrecipitation() {
		return precipitation;
	}

	/**
	 * @param precipitation the precipitation to set
	 */
	public void setPrecipitation(Double precipitation) {
		this.precipitation = precipitation;
	}

	/**
	 * @return the maxPrecipitationRate
	 */
	public Double getMaxPrecipitationRate() {
		return maxPrecipitationRate;
	}

	/**
	 * @param maxPrecipitationRate the maxPrecipitationRate to set
	 */
	public void setMaxPrecipitationRate(Double maxPrecipitationRate) {
		this.maxPrecipitationRate = maxPrecipitationRate;
	}

	/**
	 * @return the windSpeed
	 */
	public Double getWindSpeed() {
		return windSpeed;
	}

	/**
	 * @param windSpeed the windSpeed to set
	 */
	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	/**
	 * @return the maxWindSpeed
	 */
	public Double getMaxWindSpeed() {
		return maxWindSpeed;
	}

	/**
	 * @param maxWindSpeed the maxWindSpeed to set
	 */
	public void setMaxWindSpeed(Double maxWindSpeed) {
		this.maxWindSpeed = maxWindSpeed;
	}

	/**
	 * @return the windDirection
	 */
	public Double getWindDirection() {
		return windDirection;
	}

	/**
	 * @param windDirection the windDirection to set
	 */
	public void setWindDirection(Double windDirection) {
		this.windDirection = windDirection;
	}

	/**
	 * @return the maxWindDirection
	 */
	public Double getMaxWindDirection() {
		return maxWindDirection;
	}

	/**
	 * @param maxWindDirection the maxWindDirection to set
	 */
	public void setMaxWindDirection(Double maxWindDirection) {
		this.maxWindDirection = maxWindDirection;
	}

	/**
	 * @return the solarRad
	 */
	public Double getSolarRad() {
		return solarRad;
	}

	/**
	 * @param solarRad the solarRad to set
	 */
	public void setSolarRad(Double solarRad) {
		this.solarRad = solarRad;
	}

	/**
	 * @return the maxSolarRad
	 */
	public Double getMaxSolarRad() {
		return maxSolarRad;
	}

	/**
	 * @param maxSolarRad the maxSolarRad to set
	 */
	public void setMaxSolarRad(Double maxSolarRad) {
		this.maxSolarRad = maxSolarRad;
	}

	/**
	 * @return the uV
	 */
	public Double getUV() {
		return UV;
	}

	/**
	 * @param uV the uV to set
	 */
	public void setUV(Double uV) {
		UV = uV;
	}

	/**
	 * @return the maxUV
	 */
	public Double getMaxUV() {
		return maxUV;
	}

	/**
	 * @param maxUV the maxUV to set
	 */
	public void setMaxUV(Double maxUV) {
		this.maxUV = maxUV;
	}

	/**
	 * @return the leafTemp
	 */
	public Double[] getLeafTemp() {
		return leafTemp;
	}

	/**
	 * @param leafTemp the leafTemp to set
	 */
	public void setLeafTemp(Double[] leafTemp) {
		this.leafTemp = leafTemp;
	}

	/**
	 * @return the extraRad
	 */
	public Double getExtraRad() {
		return extraRad;
	}

	/**
	 * @param extraRad the extraRad to set
	 */
	public void setExtraRad(Double extraRad) {
		this.extraRad = extraRad;
	}

	/**
	 * @return the newSensors
	 */
	public Double[] getNewSensors() {
		return newSensors;
	}

	/**
	 * @param newSensors the newSensors to set
	 */
	public void setNewSensors(Double[] newSensors) {
		this.newSensors = newSensors;
	}

	/**
	 * @return the forecast
	 */
	public Integer getForecast() {
		return forecast;
	}

	/**
	 * @param forecast the forecast to set
	 */
	public void setForecast(Integer forecast) {
		this.forecast = forecast;
	}

	/**
	 * @return the eT
	 */
	public Double getET() {
		return ET;
	}

	/**
	 * @param eT the eT to set
	 */
	public void setET(Double eT) {
		ET = eT;
	}

	/**
	 * @return the soilTemp
	 */
	public Double[] getSoilTemp() {
		return soilTemp;
	}

	/**
	 * @param soilTemp the soilTemp to set
	 */
	public void setSoilTemp(Double[] soilTemp) {
		this.soilTemp = soilTemp;
	}

	/**
	 * @return the soilMoisture
	 */
	public Double[] getSoilMoisture() {
		return soilMoisture;
	}

	/**
	 * @param soilMoisture the soilMoisture to set
	 */
	public void setSoilMoisture(Double[] soilMoisture) {
		this.soilMoisture = soilMoisture;
	}

	/**
	 * @return the leafWetness
	 */
	public Double[] getLeafWetness() {
		return leafWetness;
	}

	/**
	 * @param leafWetness the leafWetness to set
	 */
	public void setLeafWetness(Double[] leafWetness) {
		this.leafWetness = leafWetness;
	}

	/**
	 * @return the extraTemp
	 */
	public Double[] getExtraTemp() {
		return extraTemp;
	}

	/**
	 * @param extraTemp the extraTemp to set
	 */
	public void setExtraTemp(Double[] extraTemp) {
		this.extraTemp = extraTemp;
	}

	/**
	 * @return the extraHum
	 */
	public Double[] getExtraHum() {
		return extraHum;
	}

	/**
	 * @param extraHum the extraHum to set
	 */
	public void setExtraHum(Double[] extraHum) {
		this.extraHum = extraHum;
	}
}
