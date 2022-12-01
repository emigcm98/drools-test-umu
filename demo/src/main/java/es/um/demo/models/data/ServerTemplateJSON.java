package es.um.demo.models.data;

public class ServerTemplateJSON {
	private String templateId;
	private String templateName;
	
	public ServerTemplateJSON() {
	}
	
	public ServerTemplateJSON(String templateId, String templateName) {
		this.templateId = templateId;
		this.templateName = templateName;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
