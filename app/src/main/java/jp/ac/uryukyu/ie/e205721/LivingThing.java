package jp.ac.uryukyu.ie.e205721;

public abstract class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String _name, int _hitPoint, int _attack){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
    }

    public boolean isDead(){
        return this.dead;
    }
    public String getName(){
        return this.name;
    }
    public void attack (LivingThing opponent){
        if(this.dead == false){//deadがfalseの時のみ攻撃できる様にした.
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public abstract void wounded(int damage);
    public void calcWounded(int damage){ 
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
        }
    }
    /**
     * 他のクラスからhitPointにアクセスするメソッド
     * @return hitPoint HP(体力)
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
}
