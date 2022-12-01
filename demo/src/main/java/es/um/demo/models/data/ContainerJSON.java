package es.um.demo.models.data;

import lombok.Data;

@Data
public class ContainerJSON {

	private String releaseIdgroupId;
	private String releaseIdartifactId;
	private String releaseIdversion;
	
	private String containerId;
	private String containerName;
	
	private ServerTemplateJSON serverTemplate;
	
	public ContainerJSON() {
	}
	
	public ContainerJSON (String releaseIdgroupId, String releaseIdartifactId,
				String releaseIdversion, String containerId, String containerName) {
		this.releaseIdgroupId = releaseIdgroupId;
		this.releaseIdartifactId = releaseIdartifactId;
		this.releaseIdversion = releaseIdversion;
		this.containerId = containerId;
		this.containerName = containerName;
	}

	public String getReleaseIdgroupId() {
		return releaseIdgroupId;
	}

	public void setReleaseIdgroupId(String releaseIdgroupId) {
		this.releaseIdgroupId = releaseIdgroupId;
	}

	public String getReleaseIdartifactId() {
		return releaseIdartifactId;
	}

	public void setReleaseIdartifactId(String releaseIdartifactId) {
		this.releaseIdartifactId = releaseIdartifactId;
	}

	public String getReleaseIdversion() {
		return releaseIdversion;
	}

	public void setReleaseIdversion(String releaseIdversion) {
		this.releaseIdversion = releaseIdversion;
	}

	public String getContainerId() {
		return containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

	public String getContainerName() {
		return containerName;
	}

	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}

	public ServerTemplateJSON getServerTemplate() {
		return serverTemplate;
	}

	public void setServerTemplate(ServerTemplateJSON serverTemplate) {
		this.serverTemplate = serverTemplate;
	}
}
