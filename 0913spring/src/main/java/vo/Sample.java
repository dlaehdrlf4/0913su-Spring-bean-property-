package vo;

public class Sample {
	private int num;
	private String name;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//출력 결과 확인하기 위해서 만들어줬다.
	@Override
	public String toString() {
		return "Sample [num=" + num + ", name=" + name + "]";
	}
	
	
	
}
