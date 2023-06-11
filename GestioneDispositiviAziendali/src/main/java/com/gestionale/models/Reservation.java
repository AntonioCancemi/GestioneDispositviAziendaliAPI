package com.gestionale.models;

import com.security.entity.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reservations")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//
//	@ManyToOne
//	@JoinColumn(name = "device_id")
	private Device device;
//
//	@ManyToOne
//	@JoinColumn(name = "user_id")
	private User user;

}
