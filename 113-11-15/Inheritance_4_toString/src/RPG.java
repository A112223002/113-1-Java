public class RPG {
    public static void main(String[] args) {
        var swordsMan = new SwordMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        //System.out.printf("劍士(%s,%d,%d)%n",swordsMan.getName(),
         //               swordsMan.getLevel(),swordsMan.getBlood());
        System.out.println(swordsMan);
        swordsMan.fight();

        var magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        //System.out.printf("魔法師(%s,%d,%d)%n",magician.getName(),
          //      magician.getLevel(),magician.getBlood());
        System.out.println(magician);
        magician.fight();

        showBlood(swordsMan);
        showBlood(magician);
    }

    static void showBlood(Role role) {
        System.out.printf("%s 血量 %d%n",
                role.getName(), role.getBlood());
    }
}
