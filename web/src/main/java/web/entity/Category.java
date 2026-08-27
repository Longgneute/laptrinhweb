package web.entity;

import java.io.Serializable;

import java.util.List;

import jakarta.persistence.*;

@Entity

@Table(name = "categories")

@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")

public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "categoryId")

	private int categoryId;

	@Column(name = "categoryname", columnDefinition = "NVARCHAR(255) NULL")

	private String categoryname;

	@Column(name = "images", columnDefinition = "NVARCHAR(255) NULL")

	private String images;

	@Column(name = "status")

	private int status;

	public Category() {

	}

	public int getCategoryId() {

		return this.categoryId;

	}

	public void setCategoryId(int categoryId) {

		this.categoryId = categoryId;

	}

	public String getCategoryname() {

		return categoryname;

	}

	public void setCategoryname(String categoryname) {

		this.categoryname = categoryname;

	}

	public String getImages() {

		return images;

	}

	public void setImages(String images) {

		this.images = images;

	}

	public int getStatus() {

		return status;

	}

	public void setStatus(int status) {

		this.status = status;

	}
}