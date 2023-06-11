package com.gestionale.models;

import com.gestionale.Enums.DeviceType;
import com.gestionale.repository.DeviceStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "devices")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDevice;

	@Column(nullable = false, name = "type")
	@Enumerated(EnumType.STRING)
	private DeviceType deviceType;

	@Column(nullable = false, name = "status")
	@Enumerated(EnumType.STRING)
	private DeviceStatus deviceStatus;

}
