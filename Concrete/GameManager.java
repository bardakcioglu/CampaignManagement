package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void Add(Game game) {
		System.out.println("Game : " + game.gameName + " added.");
	}

	@Override
	public void Update(Game game) {
		System.out.println("Game : " + game.gameName + " updated.");
	}

	@Override
	public void Delete(Game game) {
		System.out.println("Game : " + game.gameName + " deleted.");
	}

}
