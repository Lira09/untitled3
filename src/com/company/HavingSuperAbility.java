package com.company;

public interface HavingSuperAbility {
    void  applySuperAbility(String superAbilityType);
}
//Создать интерфейс com.company.HavingSuperAbility (имеющий суперспособность) добавить в него 1 абстрактный метод applySuperAbility(String superAbilityType);
//● Создать абстрактный класс Hero с полями здоровье, урон и тип суперспособности и реализовать интерфейс com.company.HavingSuperAbility.
//● Создать 3 класса героев Magic, Medic, Warrior и наследовать их от класса Hero
// . В каждом классе по своему реализовать метод applySuperAbility(String superAbilityType) следующим образом - просто распечатать что то вроде того “Warrior применил суперспособность CRITICAL DAMAGE”.
//● В классе Main создать массив из 3х разных героев, затем через цикл применить суперспособность каждого героя.