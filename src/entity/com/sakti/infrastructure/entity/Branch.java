package com.sakti.infrastructure.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="branch")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Branch {

	@Id
    @SequenceGenerator(name="branch_id_seq",sequenceName="branch_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "branch_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private int id;
	
	@Column(name="branch_group_id")
	private int branchGroupId;
	
	@Column(name="code")
	private String code;
	
	@Column(name="description")
	private String description;
	
	@Column(name="is_active")
	private short isActive;
	
	@Column(name="created_at")
	private java.sql.Timestamp createdAt;
	
	@Column(name="updated_at")
	private java.sql.Timestamp updatedAt;
	
	@Column(name="created_user_id")
	private int createdUserId;
	
	@Column(name="updated_user_id")
	private int updatedUserId;
	
	@Column(name="code_number")
	private String codeNumber;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="created_user_id", referencedColumnName="id", insertable = false, updatable = false)
	private AppUser createdUser;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="updated_user_id", referencedColumnName="id", insertable = false, updatable = false)
	private AppUser updatedUser;
}
