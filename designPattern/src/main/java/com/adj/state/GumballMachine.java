package com.adj.state;

// 这里的状态改变，方法里面if-else不是状态模式，应该状态抽象为不同的实现状态的类，包含所有动作的方法，所有状态变化委托给状态类
public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count > 0) {
            state = NO_QUARTER;
        }
    }
}
