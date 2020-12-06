package jp.ac.uryukyu.ie.e205721;

public class Warrior extends Hero{
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if (isDead()== false){
            int damage = calcAttackWithWeponSkillDamage();
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public int calcAttackWithWeponSkillDamage(){
        int attackDamage = (int)(getAttack() * 1.5);
        return attackDamage;
    }
}
