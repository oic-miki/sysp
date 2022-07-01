
public class C0153 extends Student implements DTO{
	
	public C0153(final String name) {
		
		super(name);
		
	}
	
	public int getData() {
		DTO dto = new StubDTO();
		
		return dto.getData();
	}
	
}
