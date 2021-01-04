package com.sakti.infrastructure.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

	@Column(name="app_role_id")
	private long appRoleId;
	
	@Column(name="user_type")
	private short userType;
	
	@Temporal(TemporalType.DATE)
	@Column(name="change_password_next_date")
	private Date changePasswordNextDate;

	@CreationTimestamp
	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="is_lock")
	private short isLock;

	@Column(name="must_change_password")
	private short mustChangePassword;

	@Column(name="password")
	private String password;

	@Column(name="registered_from")
	private String registeredFrom;

	@UpdateTimestamp
	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="username")
	private String username;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="app_role_id", referencedColumnName="id", insertable = false, updatable = false)
	private AppRole appRole;
}
