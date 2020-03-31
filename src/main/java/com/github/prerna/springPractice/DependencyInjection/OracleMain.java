package com.github.prerna.springPractice.DependencyInjection;

public class OracleMain {
    public static void main(String[] args) {
        Oracle oracle = new BookWormOracle();
        oracle.defineLife();
    }
}
