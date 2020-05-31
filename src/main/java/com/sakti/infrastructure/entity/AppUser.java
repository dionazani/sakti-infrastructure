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
import org.hibernate.annotations.GenericGenerator;

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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_user_seq")
	@SequenceGenerator(name="app_user_seq", sequenceName="app_user_seq",allocationSize=1)
	private long id;

	private long roleId;
	
	@Temporal(TemporalType.DATE)
	private Date changePasswordNextDate;

	private Timestamp createdAt;

	private short isLock;

	private short mustChangePassword;

	private String password;

	private String registeredFrom;

	private Timestamp updatedAt;

	private String username;
}
