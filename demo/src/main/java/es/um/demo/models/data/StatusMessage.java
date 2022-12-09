package es.um.demo.models.data;

import lombok.Data;

@Data
public class StatusMessage {
	private String message;
	private String status;
	private String stacktrace;
	
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
	
	public String getStacktrace() {
		return stacktrace;
	}

	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
	}
	
}
