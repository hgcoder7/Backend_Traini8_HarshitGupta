package com.traini8.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.Instant;
import java.util.List;

@Entity
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 40)
    private String centerName;
    
    @Column(nullable = false, unique = true, length = 12)
    private String centerCode;
    
    @Embedded
    private Address address;
    
    private int studentCapacity;
    
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "courses_offered", joinColumns = @JoinColumn(name = "center_id"))
    @Column(name = "course")
    private List<String> coursesOffered;
    
    private Instant createdOn = Instant.now();
    
    @Email
    private String contactEmail;
    
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
    private String contactPhone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public List<String> getCoursesOffered() {
		return coursesOffered;
	}

	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
    
    // Getters and Setters
    
}

