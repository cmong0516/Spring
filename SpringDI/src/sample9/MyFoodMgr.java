package sample9;

public class MyFoodMgr {
	private Food favoriteFood;
	private Food unFavoriteFood;
	public MyFoodMgr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyFoodMgr(Food favoriteFood, Food unFavoriteFood) {
		super();
		this.favoriteFood = favoriteFood;
		this.unFavoriteFood = unFavoriteFood;
	}
	public Food getFavoriteFood() {
		return favoriteFood;
	}
	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	public Food getUnFavoriteFood() {
		return unFavoriteFood;
	}
	public void setUnFavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
	}
	@Override
	public String toString() {
		return "MyFoodMgr [favoriteFood=" + favoriteFood + ", unFavoriteFood=" + unFavoriteFood + "]";
	}
	
	
}
