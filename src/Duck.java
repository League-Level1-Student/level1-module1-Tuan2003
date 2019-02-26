public class Duck {
int numberOfFriends;
String favoriteFood;

Duck(String favoriteFood, int numberOfFriends) {
  	this.favoriteFood = favoriteFood;
  	this.numberOfFriends = numberOfFriends;
}

void quack() {
System.out.println("Quack ! Your duck has " + numberOfFriends + " friends.");
}
void waddle() {
	System.out.println("Waddle ! Your duck is happy because it ate " + favoriteFood);
}

}
