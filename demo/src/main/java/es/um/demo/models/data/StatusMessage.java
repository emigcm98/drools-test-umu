package es.um.demo.models.data;

import lombok.Data;

@Data
public class StatusMessage {
	private String message;
	private String status;
	
	public StatusMessage() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
