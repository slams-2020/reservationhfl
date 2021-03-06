package net.reserv.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Role {
	@Entity
	@Table(name = "roles")
	public class UserRole {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;

		@Enumerated(EnumType.STRING)
		@Column(length = 20)
		private RoleUser name;

		public Role() {

		}

		public Role(RoleUser name) {
			this.name = name;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public RoleUserRole getName() {
			return name;
		}

		public void setName(RoleUser name) {
			this.name = name;
		}
	}
}
