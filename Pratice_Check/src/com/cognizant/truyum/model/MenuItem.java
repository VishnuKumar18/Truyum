/**
 * 
 */
package com.cognizant.truyum.model;

import java.util.Date;

/**
 * @author VishnuKumar
 *
 */
public class MenuItem {
	private long id;
	private String name;
    private float price;
    private  boolean active;
    private Date dateofLaunch;
    private String category;
    private boolean freeDelivery;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	/**
	 * @return the dateofLaunch
	 */
	public Date getDateofLaunch() {
		return dateofLaunch;
	}
	/**
	 * @param dateofLaunch the dateofLaunch to set
	 */
	public void setDateofLaunch(Date dateofLaunch) {
		this.dateofLaunch = dateofLaunch;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the freeDelivery
	 */
	public boolean isFreeDelivery() {
		return freeDelivery;
	}
	/**
	 * @param freeDelivery the freeDelivery to set
	 */
	public void setFreeDelivery(boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}
	/**
	 * 
	 */
	public MenuItem() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param active
	 * @param dateofLaunch
	 * @param category
	 * @param freeDelivery
	 */
	public MenuItem(long id, String name, float price, boolean active,
			Date dateofLaunch, String category, boolean freeDelivery) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateofLaunch = dateofLaunch;
		this.category = category;
		this.freeDelivery = freeDelivery;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	
	
	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", price=" + price
				+ ", active=" + active + ", dateofLaunch=" + dateofLaunch
				+ ", category=" + category + ", freeDelivery=" + freeDelivery
				+ "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result
				+ ((dateofLaunch == null) ? 0 : dateofLaunch.hashCode());
		result = prime * result + (freeDelivery ? 1231 : 1237);
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuItem other = (MenuItem) obj;
		if (active != other.active)
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (dateofLaunch == null) {
			if (other.dateofLaunch != null)
				return false;
		} else if (!dateofLaunch.equals(other.dateofLaunch))
			return false;
		if (freeDelivery != other.freeDelivery)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}
    

}
