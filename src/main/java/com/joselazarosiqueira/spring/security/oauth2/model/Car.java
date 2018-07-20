package com.joselazarosiqueira.spring.security.oauth2.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CAR")
public @Data class Car implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id = null;

	@Column(name = "REGISTRATION_NUMBER")
	private String registrationNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private Company company;
}
