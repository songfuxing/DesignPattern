package com.songfuxing.patterns.complex.combination;


/**
 * Created by songfuxing on 2018/8/23.
 */
public class Main {
    public static void main(String[] args) {
        Main simulator = new Main();
        simulator.simulate();
    }

    void simulate() {
        Quackable duckCall = new DuckCall();
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        // 鸭子适配器
        Quackable gooseAdapter = new GooseAdapter(new Goose());
        simulate(duckCall);
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(gooseAdapter);

        //-------------装饰器模式，增加统计次数功能--------------------
        Quackable duckCall1 = new QuackCounter(new DuckCall());
        Quackable mallardDuck1 = new QuackCounter(new MallardDuck());
        Quackable redheadDuck1 = new QuackCounter(new RedheadDuck());
        Quackable gooseAdapter1 = new QuackCounter(new GooseAdapter(new Goose()));

        simulate(duckCall1);
        simulate(mallardDuck1);
        simulate(redheadDuck1);
        simulate(gooseAdapter1);
        System.out.println(QuackCounter.getCount());

        // ----------------使用工厂产生鸭子------------
        AbstractDuckFactory factory = new DuckFactory();
        Quackable duckCall2 = factory.createDuckCall();
        Quackable mallardDuck2 = factory.createMallardDuck();
        Quackable redheadDuck2 = factory.createRedheadDuck();

        simulate(duckCall2);
        simulate(mallardDuck2);
        simulate(redheadDuck2);


        // --------使用组合处理各种子集-------------
        Flock flock = new Flock();
        flock.add(duckCall);
        flock.add(mallardDuck);
        flock.add(redheadDuck);
        flock.add(gooseAdapter);

        Flock flockOfMarllard = new Flock();
        flockOfMarllard.add(mallardDuck);
        flockOfMarllard.add(mallardDuck1);
        flockOfMarllard.add(mallardDuck2);

        flock.add(flockOfMarllard);

        simulate(flock);

        System.out.println(QuackCounter.getCount());

    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
