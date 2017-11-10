package com.example.lostpetsfinderapp;


import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Pets
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	@Size(min = 2,message = "Enter Pet Name")
	private String PetName;


	@NotNull
	@Min(1)
	private int Age;

	@NotNull
	@Size(min = 2)
	private String Type;


	private String Breed;

	@NotNull
	@Size(min = 2)
	private String Colour;


	private String Distinguishingfeatures ;

	@NotNull
	@Size(min = 2)
	private String CellPhone ;

	public String getStatus()
	{
		return Status;
	}

	public void setStatus(String status)
	{
		Status = status;
	}

	private String Status="Lost" ;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getPetName()
	{
		return PetName;
	}

	public void setPetName(String petName)
	{
		PetName = petName;
	}



	public String getType()
	{
		return Type;
	}

	public void setType(String type)
	{
		Type = type;
	}

	public String getBreed()
	{
		return Breed;
	}

	public void setBreed(String breed)
	{
		Breed = breed;
	}

	public String getColour()
	{
		return Colour;
	}

	public void setColour(String colour)
	{
		Colour = colour;
	}

	public String getDistinguishingfeatures()
	{
		return Distinguishingfeatures;
	}

	public void setDistinguishingfeatures(String distinguishingfeatures)
	{
		Distinguishingfeatures = distinguishingfeatures;
	}

	public String getCellPhone()
	{
		return CellPhone;
	}

	public void setCellPhone(String cellPhone)
	{
		CellPhone = cellPhone;
	}

	public int getAge()
	{
		return Age;
	}

	public void setAge(int age)
	{
		Age = age;
	}
}