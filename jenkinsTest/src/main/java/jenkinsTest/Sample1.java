package jenkinsTest;

public class Sample1 {

	String sampler1;
	String sampler2;

	public String getSampler1() {
		return sampler1;
	}

	public void setSampler1(String sampler1) {
		this.sampler1 = sampler1;
	}
 
	public String getSampler2() {
		return sampler2;
	}

	public void setSampler2(String sampler2) {
		this.sampler2 = sampler2;
	}

	@Override
	public String toString() {
		return "Sample1 [sampler1=" + sampler1 + ", sampler2=" + sampler2 + "]";
	}
}
