package es.um.demo.models.data;

import lombok.Data;

@Data
public class StatusMessage {
	
	enum Status {
		OK,
		FAIL
	}
	
	private String message;
	private String status;
	private Status stacktrace;
	
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
	
	public Status getStacktrace() {
		return stacktrace;
	}

	public void setStacktrace(Status stacktrace) {
		this.stacktrace = stacktrace;
	}
	
}
