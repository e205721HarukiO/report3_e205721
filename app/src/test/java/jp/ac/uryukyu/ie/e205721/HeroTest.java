package jp.ac.uryukyu.ie.e205721;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    /**
     * Heroクラスからオブジェクトを生成し、
     * attackWithWeponSkillを3回実行し、
     * 3回ともattackの150%ダメージになっていることを確認する
     */

     @Test
     void attackWithWeponSkillTest(){
         int defaultAttack = 5;
         int skillDamage = (int)(defaultAttack * 1.5);
         int defaultEnemyHP = 100;
         Warrior demoWarrior = new Warrior("デモ戦士", 100, defaultAttack);
         Enemy demoEnemy = new Enemy("デモ敵", defaultEnemyHP, 0);
         demoWarrior.attackWithWeponSkill(demoEnemy);
         int damage = defaultEnemyHP - demoEnemy.getHitPoint();

         //敵が受けたダメージとAttackWithWeponSkillDamageの計算があっているかのテスト
         assertEquals(damage, demoWarrior.calcAttackWithWeponSkillDamage());
     }
}
