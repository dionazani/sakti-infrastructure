package com.sakti.infrastructure.entity;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name="debtor")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Debtor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id  
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "debtor_seq")
	@SequenceGenerator(name="debtor_seq", sequenceName="debtor_seq",allocationSize=1)
	private long id;
	
	@Column(name="debtor_type")
	private String debtorType;

	private String email;

	@Column(name="app_user_id")
	private long appUserId;
	
	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="created_user_id")
	private long createdUserId;
	
	@Column(name="updated_at", insertable=false)
	private Timestamp updatedAt;

	@Column(name="updated_user_id", insertable=false)
	private Long updatedUserId;

}