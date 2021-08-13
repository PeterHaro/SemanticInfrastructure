package no.sintef.input;

import java.util.List;
import java.util.Map;

public class Alert {
	
	//input
	private int sample_id;
	private String sn;
	private String operator;
	private int bottle_number;
	private int measurement_type_id;
	private String measurement_type;
	private int calibration_id;
	private String calibration;
	private double incubation_time;
	private String blank_value;
	private int blank_1;
	private int blank_2;
	private int blank_3;
	private int date;
	private int stopped_date;
	private double time_passed;
	private String location;
	private boolean is_real_gps;
	private double longitude;
	private double latitude;
	private double battery_level;
	private int gsm_signal;
	private double temperature;
	private boolean is_in_machine;
	private boolean is_valid;
	private String label;
	private int status;
	private String firmware_version;
	private int quality_level;
	private String comment;
	//private Map<String, String> measurement_result;
	private List <MeasurementResult> measurement_result;
	
	
	public Alert(int sample_id, String sn, String operator, int bottle_number, int measurement_type_id,
			String measurement_type, int calibration_id, String calibration, double incubation_time, String blank_value,
			int blank_1, int blank_2, int blank_3, int date, int stopped_date, double time_passed, String location,
			boolean is_real_gps, double longitude, double latitude, double battery_level, int gsm_signal,
			double temperature, boolean is_in_machine, boolean is_valid, String label, int status,
			String firmware_version, int quality_level, String comment, List<MeasurementResult> measurement_result) {
		this.sample_id = sample_id;
		this.sn = sn;
		this.operator = operator;
		this.bottle_number = bottle_number;
		this.measurement_type_id = measurement_type_id;
		this.measurement_type = measurement_type;
		this.calibration_id = calibration_id;
		this.calibration = calibration;
		this.incubation_time = incubation_time;
		this.blank_value = blank_value;
		this.blank_1 = blank_1;
		this.blank_2 = blank_2;
		this.blank_3 = blank_3;
		this.date = date;
		this.stopped_date = stopped_date;
		this.time_passed = time_passed;
		this.location = location;
		this.is_real_gps = is_real_gps;
		this.longitude = longitude;
		this.latitude = latitude;
		this.battery_level = battery_level;
		this.gsm_signal = gsm_signal;
		this.temperature = temperature;
		this.is_in_machine = is_in_machine;
		this.is_valid = is_valid;
		this.label = label;
		this.status = status;
		this.firmware_version = firmware_version;
		this.quality_level = quality_level;
		this.comment = comment;
		this.measurement_result = measurement_result;
	}


	public int getSample_id() {
		return sample_id;
	}


	public void setSample_id(int sample_id) {
		this.sample_id = sample_id;
	}


	public String getSn() {
		return sn;
	}


	public void setSn(String sn) {
		this.sn = sn;
	}


	public String getOperator() {
		return operator;
	}


	public void setOperator(String operator) {
		this.operator = operator;
	}


	public int getBottle_number() {
		return bottle_number;
	}


	public void setBottle_number(int bottle_number) {
		this.bottle_number = bottle_number;
	}


	public int getMeasurement_type_id() {
		return measurement_type_id;
	}


	public void setMeasurement_type_id(int measurement_type_id) {
		this.measurement_type_id = measurement_type_id;
	}


	public String getMeasurement_type() {
		return measurement_type;
	}


	public void setMeasurement_type(String measurement_type) {
		this.measurement_type = measurement_type;
	}


	public int getCalibration_id() {
		return calibration_id;
	}


	public void setCalibration_id(int calibration_id) {
		this.calibration_id = calibration_id;
	}


	public String getCalibration() {
		return calibration;
	}


	public void setCalibration(String calibration) {
		this.calibration = calibration;
	}


	public double getIncubation_time() {
		return incubation_time;
	}


	public void setIncubation_time(double incubation_time) {
		this.incubation_time = incubation_time;
	}


	public String getBlank_value() {
		return blank_value;
	}


	public void setBlank_value(String blank_value) {
		this.blank_value = blank_value;
	}


	public int getBlank_1() {
		return blank_1;
	}


	public void setBlank_1(int blank_1) {
		this.blank_1 = blank_1;
	}


	public int getBlank_2() {
		return blank_2;
	}


	public void setBlank_2(int blank_2) {
		this.blank_2 = blank_2;
	}


	public int getBlank_3() {
		return blank_3;
	}


	public void setBlank_3(int blank_3) {
		this.blank_3 = blank_3;
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}


	public int getStopped_date() {
		return stopped_date;
	}


	public void setStopped_date(int stopped_date) {
		this.stopped_date = stopped_date;
	}


	public double getTime_passed() {
		return time_passed;
	}


	public void setTime_passed(double time_passed) {
		this.time_passed = time_passed;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public boolean isIs_real_gps() {
		return is_real_gps;
	}


	public void setIs_real_gps(boolean is_real_gps) {
		this.is_real_gps = is_real_gps;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getBattery_level() {
		return battery_level;
	}


	public void setBattery_level(double battery_level) {
		this.battery_level = battery_level;
	}


	public int getGsm_signal() {
		return gsm_signal;
	}


	public void setGsm_signal(int gsm_signal) {
		this.gsm_signal = gsm_signal;
	}


	public double getTemperature() {
		return temperature;
	}


	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}


	public boolean isIs_in_machine() {
		return is_in_machine;
	}


	public void setIs_in_machine(boolean is_in_machine) {
		this.is_in_machine = is_in_machine;
	}


	public boolean isIs_valid() {
		return is_valid;
	}


	public void setIs_valid(boolean is_valid) {
		this.is_valid = is_valid;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getFirmware_version() {
		return firmware_version;
	}


	public void setFirmware_version(String firmware_version) {
		this.firmware_version = firmware_version;
	}


	public int getQuality_level() {
		return quality_level;
	}


	public void setQuality_level(int quality_level) {
		this.quality_level = quality_level;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public List<MeasurementResult> getMeasurement_result() {
		return measurement_result;
	}


	public void setMeasurement_result(List<MeasurementResult> measurement_result) {
		this.measurement_result = measurement_result;
	}
	

	
	public class MeasurementResult {
		
		/**
		 * detection time in hours
		 */
		private String detection;
		/**
		 * 0: not modified; 1: manually modified
		 */
		private int detection_status;
		/**
		 * detection manually modify user
		 */
		private String detection_modify_user;
		/**
		 * detection manually modify time in UNIX timestamp (seconds)
		 */
		private int detection_modify_time;
		/**
		 * measurement name
		 */
		private String label;
		/**
		 * result number
		 */
		private double result;
		/**
		 * result unit
		 */
		private String unit;
		/**
		 * result status. 0: normal detection; 1: concentration not available; 2: system lower limit reached; 3: temperory detection, giving the upper limit of the result, measurement on going
		 */
		private int status;
		/**
		 * server message for the result
		 */
		private String message;
		
		public MeasurementResult(String detection, int detection_status, String detection_modify_user,
				int detection_modify_time, String label, double result, String unit, int status, String message) {
			super();
			this.detection = detection;
			this.detection_status = detection_status;
			this.detection_modify_user = detection_modify_user;
			this.detection_modify_time = detection_modify_time;
			this.label = label;
			this.result = result;
			this.unit = unit;
			this.status = status;
			this.message = message;
		}

		public String getDetection() {
			return detection;
		}

		public void setDetection(String detection) {
			this.detection = detection;
		}

		public int getDetection_status() {
			return detection_status;
		}

		public void setDetection_status(int detection_status) {
			this.detection_status = detection_status;
		}

		public String getDetection_modify_user() {
			return detection_modify_user;
		}

		public void setDetection_modify_user(String detection_modify_user) {
			this.detection_modify_user = detection_modify_user;
		}

		public int getDetection_modify_time() {
			return detection_modify_time;
		}

		public void setDetection_modify_time(int detection_modify_time) {
			this.detection_modify_time = detection_modify_time;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public double getResult() {
			return result;
		}

		public void setResult(double result) {
			this.result = result;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
		
		
		
	}

}
