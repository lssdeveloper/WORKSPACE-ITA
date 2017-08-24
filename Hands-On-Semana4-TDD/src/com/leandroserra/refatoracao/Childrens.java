package com.leandroserra.refatoracao;

public class Childrens extends Movie{

	public Childrens(String title) {
		super(title);
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

	@Override
	public double getAmount(int daysRented) {
		Double thisAmount = 1.5;
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 1.5;
		
		return thisAmount;
	}

}
