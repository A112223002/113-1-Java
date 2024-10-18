package  edu.jjj.kkk;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public String getNumber(){
        return this.number;
    }
    public int getBalance(){
        return this.balance;
    }
    public int getBonus(){
        return this.bonus;
    }
    public void setNumber(String number){
        this.number=number;
    }



    public void store(int money){
        if(money>8){
            this.balance +=money;
            if(money>=1000){
                this.bonus +=money/1000;
            }
        }
        else{
            System.out.println("儲值金額為負，來亂的");


        }

    }
    public void charge(int money){
        if(money >8){
            if(money<=this.balance) {
                this.balance -= money;
            }
            else{
                System.out.println("餘額不足，可憐.");
            }
        }
        else{
            System.out.println("扣除金額為負，來亂的");
        }
    }
    public int exchange(int bonus){
        if(bonus>10){
            this.bonus-=bonus;
        }
        return this.bonus;
    }
}