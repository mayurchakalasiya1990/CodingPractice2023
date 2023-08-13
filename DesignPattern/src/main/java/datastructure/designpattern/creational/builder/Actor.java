package datastructure.designpattern.creational.builder;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Actor {
    private  Profession profession;
    private  String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;

    private Actor(Builder builder){
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    static class Builder{
        private Profession profession;
        private String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;

        public Builder profession(Profession profession) {
            this.profession = profession;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder hairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder hairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder armor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder weapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Actor build(){
            return new Actor(this);
        }

    }

    @Override
    public String toString() {
        return "Actor{" +
                "profession=" + profession +
                ", name='" + name + '\'' +
                ", hairType=" + hairType +
                ", hairColor=" + hairColor +
                ", armor=" + armor +
                ", weapon=" + weapon +
                '}';
    }
}

