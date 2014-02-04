package com.xhighx.psetool.model;

import java.util.ArrayList;

public class PseItemSet extends Item{
	private String summary;
	private ArrayList<Item> itemSet;
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return summary;
	}

	public PseItemSet(String summary) {
		this.summary = summary;
		itemSet = new ArrayList<Item>();
	}
	public PseItemSet(String summary, ArrayList<Item> itemSet){
		this.summary = summary;
		this.itemSet = itemSet;
	}
	/**
	 * @return the pse item set
	 */
	public ArrayList<Item> getItemGroup() {
		return itemSet;
	}
	
	/**
	 * @param itemSet to set itemSet
	 */
	public void setItemGroup(ArrayList<Item> itemSet) {
		this.itemSet = itemSet;
	}

}
