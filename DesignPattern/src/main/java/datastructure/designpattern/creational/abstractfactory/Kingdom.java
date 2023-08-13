package datastructure.designpattern.creational.abstractfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kingdom {

    private King king;
    private Castle castle;
    private Army army;

    public static class FactoryMaker {

        public enum KingdomType {
            ORC, ELF
        }

        static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("Kingdom Not Support...");
            }
        }
    }
}
