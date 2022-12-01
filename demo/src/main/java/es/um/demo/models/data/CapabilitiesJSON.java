package es.um.demo.models.data;

import java.util.LinkedList;
import java.util.List;
import lombok.Data;

@Data
public class CapabilitiesJSON {
	private List<String> capabilities;
	
	public CapabilitiesJSON() {
		capabilities = new LinkedList<>();
	}

	public List<String> getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(List<String> capabilities) {
		this.capabilities = capabilities;
	}
}
