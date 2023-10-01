public class Equipment {

    private String name;
    private IWeaponStrategy weapon;
    private String armour;
    private String Throu;


    public Equipment(String name, IWeaponStrategy weapon, String armour, String throu) {
        this.name = name;
        this.weapon = weapon;
        this.armour = armour;
        Throu = throu;
    }
}
