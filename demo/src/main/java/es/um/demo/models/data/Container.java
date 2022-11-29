package es.um.demo.models.data;

import lombok.Data;

@Data
public class Container {
	
	private String id;
	private String releaseId;
	
	public Container(String id, String releaseId) {
		this.id = id;
		this.releaseId = releaseId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReleaseId() {
		return releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
	}
	
}
