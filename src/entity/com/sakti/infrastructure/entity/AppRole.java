package com.sakti.infrastructure.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="app_role")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppRole {
	
	@Id
	private long id;

	private String code;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String description;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="updated_at")
	private Timestamp updatedAt;
}
