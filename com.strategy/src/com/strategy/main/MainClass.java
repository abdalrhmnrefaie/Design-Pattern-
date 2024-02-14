package com.strategy.main;

import com.strategy.fly.FlyNoWay;
import com.strategy.fly.FlyWithWings;
import com.strategy.fly.IFlyBehaviour;
import com.strategy.quack.IQuackBehaviour;
import com.strategy.quack.MuteQuack;
import com.strategy.quack.Quack;
import com.strategy.quack.Squeek;

public class MainClass {
	public static void main(String[] args) {

		// Red Head Duck

		IFlyBehaviour flyBehaviour = new FlyWithWings();
		IQuackBehaviour quackBehaviour = new Quack();

		Duck redHeadDuck = new RedHeadDuck();
		redHeadDuck.setFlyBehaviour(flyBehaviour);
		redHeadDuck.setQuackBehaviour(quackBehaviour);

		redHeadDuck.performQuack();
		redHeadDuck.performFly();

		// Rubber Duck

		IFlyBehaviour noFlyBehaviour = new FlyNoWay();
		IQuackBehaviour squeekBehaviour = new Squeek();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.setQuackBehaviour(squeekBehaviour);
		rubberDuck.setFlyBehaviour(noFlyBehaviour);

		rubberDuck.performFly();
		rubberDuck.performQuack();

		// Wodden Duck

		IQuackBehaviour noQuackBehaviour = new MuteQuack();

		Duck woddenDuck = new WoddenDuck();
		woddenDuck.setFlyBehaviour(noFlyBehaviour);
		woddenDuck.setQuackBehaviour(noQuackBehaviour);

		woddenDuck.performQuack();
		woddenDuck.performFly();
	}
}
