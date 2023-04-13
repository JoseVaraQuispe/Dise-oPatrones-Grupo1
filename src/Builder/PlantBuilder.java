package Builder;

public class PlantBuilder {
	private int id;
	private int age;
	private int size;
	private String color;
	private String scientificName;
	private String climate;
	private String lightPreference;

	public PlantBuilder setId(int id) {
		this.id=id;
		return this;
	}
	public PlantBuilder setAge(int age) {
		this.age=age;
		return this;
	}
	public PlantBuilder setSize(int size) {
		this.size=size;
		return this;
	}
	public PlantBuilder setColor(String color) {
		this.color=color;
		return this;
	}
	public PlantBuilder setScientificName(String scientificName) {
		this.scientificName=scientificName;
		return this;
	}
	public PlantBuilder setClimate(String climate) {
		this.climate=climate;
		return this;
	}
	public PlantBuilder setLightPreference(String lightPreference) {
		this.lightPreference=lightPreference;
		return this;
	}
	
	public Plant build() {
		Plant plant = new Plant();
		plant.setId(this.id);
		plant.setAge(this.age);
		plant.setSize(this.size);
		plant.setColor(this.color);
		plant.setScientificName(this.scientificName);
		plant.setClimate(this.climate);
		plant.setLightPreference(this.lightPreference);
		return plant;
	}

}
