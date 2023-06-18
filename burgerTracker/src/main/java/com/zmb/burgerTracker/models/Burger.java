package com.zmb.burgerTracker.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size; 

@Entity
@Table(name="burgers")
public class Burger {
	// ========== Primary Key ===================
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		// ========== Member Variables ==============
		@NotNull
		@Size(min=1,max=25, message="Must provide a burger name")
		private String burgerName;
		
		@NotNull
		@Size(min=1,max=25, message="Must provide a restaurant name")
		private String restaurantName;
		
		@NotNull
		@Max(5)
		@Min(1)
		private Integer rating;
		
		@NotNull
		@Size(min=5,max=200, message="Must provide a notes")
		private String notes;

		// ========== Data Creation Trackers ========

		@Column(updatable = false) // annotations only apply to the direct line of java code below it
		 private Date createdAt;
		 private Date updatedAt;
		// ========== Constructors ===================
		
		public Burger() {}
		
		public Burger(String burgerName, String restaurantName, Integer rating, String notes) {
			this.burgerName = burgerName;
			this.restaurantName = restaurantName;
			this.rating = rating;
			this.notes = notes;
		}
		// ========== Data Creation Event ===========

		@PrePersist
		protected void onCreate() {
		this.createdAt = new Date();
				}

		@PreUpdate
		protected void onUpdate() {
		this.updatedAt = new Date();
				}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBurgerName() {
			return burgerName;
		}

		public void setBurgerName(String burgerName) {
			this.burgerName = burgerName;
		}

		public String getRestaurantName() {
			return restaurantName;
		}

		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}

		public Integer getRating() {
			return rating;
		}

		public void setRating(Integer rating) {
			this.rating = rating;
		}

		public String getNotes() {
			return notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		// ========== Getters and Setters ===========
		
}
