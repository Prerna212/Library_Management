package com.github.prerna.springPractice.DependencyInjection;

public class BookWormOracle implements Oracle {

    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia){
        this.encyclopedia = encyclopedia;
    }
    @Override
    public String defineLife() {
        return "encyclopedia sucks! go outside and have fun";
    }
}
