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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="app_user")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

	@Id
    @SequenceGenerator(name="app_user_id_seq",sequenceName="app_user_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "app_user_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private long id;

	private long appRoleId;
	
	private short userType;
	
	@Temporal(TemporalType.DATE)
	private Date changePasswordNextDate;

	@CreationTimestamp
	private Timestamp createdAt;

	private short isLock;

	private short mustChangePassword;

	private String password;

	private String registeredFrom;

	@UpdateTimestamp
	private Timestamp updatedAt;

	private String username;
}
