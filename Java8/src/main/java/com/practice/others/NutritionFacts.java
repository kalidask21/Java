package com.practice.others;

public class NutritionFacts {

	private final int servingSize;
	private final int serving;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbs;

	public static class Builder {

		private  int servingSize = 0;
		private  int serving = 0;
		private  int calories = 0;
		private  int fat = 0;
		private  int sodium = 0;
		private  int carbs = 0;

		public Builder(int servingSize, int serving) {
			this.servingSize = servingSize;
			this.serving = serving;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbs = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
		
	}
	
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		serving = builder.serving;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbs = builder.carbs;
	}
	
	
	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
		calories(100).sodium(35).carbohydrate(27).build();
		
		System.out.println(cocaCola.calories);
	}
}
