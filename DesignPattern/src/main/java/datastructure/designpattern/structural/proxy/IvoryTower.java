package datastructure.designpattern.structural.proxy;

public class IvoryTower implements WizardTower{
    @Override
    public void enter(Wizard wizard) {
        System.out.println("%s enters the tower.".formatted(wizard));
    }
}
