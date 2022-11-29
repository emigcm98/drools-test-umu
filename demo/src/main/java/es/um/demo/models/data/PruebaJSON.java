package es.um.demo.models.data;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PruebaJSON {
	
	private String name;
	private List<Container> containers;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Container> getContainers() {
		return containers;
	}
	public void setContainers(List<Container> containers) {
		this.containers = containers;
	}

	public PruebaJSON(String name) {
		this.name = name;
		this.containers = new ArrayList<Container>();
	}
	
	public void addContainer(Container c) {
		containers.add(c);
	}

}


