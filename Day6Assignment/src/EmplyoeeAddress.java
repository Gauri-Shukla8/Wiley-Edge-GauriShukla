
public class EmplyoeeAddress {
	private int flatNo;
	private String flatName,roadName,cityName;
	private EmpAddressType empAddType;

	public EmplyoeeAddress(int flatNo, String flatName, String roadName, String cityName, EmpAddressType empAddType) {
		super();
		this.flatNo = flatNo;
		this.flatName = flatName;
		this.roadName = roadName;
		this.cityName = cityName;
		this.empAddType = empAddType;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getFlatName() {
		return flatName;
	}
	public void setFlatName(String flatName) {
		this.flatName = flatName;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public EmpAddressType getEmpAddType() {
		return empAddType;
	}
	public void setEmpAddType(EmpAddressType empAddType) {
		this.empAddType = empAddType;
	}
	
	
	@Override
	public String toString() {
		return "EmplyoeeAddress [flatNo=" + flatNo + ", flatName=" + flatName + ", roadName=" + roadName + ", cityName="
				+ cityName + ", empAddType=" + empAddType + "]";
	}

}
