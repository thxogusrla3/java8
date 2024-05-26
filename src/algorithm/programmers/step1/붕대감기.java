package algorithm.programmers.step1;

public class 붕대감기 {
    public static void main(String[] args) {
//        {2, 4, 4}, 100, {{1, 96}, {18, 1}}
//        {1, 1, 1}, 5,   {{1, 2}, {3, 2}}
        final int[] bandage = {2, 4, 4};
        final int health = 100;
        final int[][] attacks = {{1, 96}, {18, 1}};

        int totalHealth = health;
        int differenceAttack = 0;
        for(int i = 0 ; i < attacks.length; i++) {
            if( i == 0) {
                differenceAttack = attacks[i][0];
            } else {
                differenceAttack = attacks[i][0] - attacks[i - 1][0];
            }
            System.out.println("differenceAttack => " + differenceAttack);

            for(int j = 1; j <= differenceAttack; j++) {
                totalHealth = Math.min(totalHealth + bandage[1], health);
                if (j % (bandage[0]) == 0) {
                    totalHealth = Math.min(totalHealth + bandage[2], health);
                }
                System.out.println("heal => " + totalHealth);
            }
            totalHealth = totalHealth - attacks[i][1];
            System.out.println("attack => " + attacks[i][1] + " " + totalHealth);
            if(totalHealth <= 0) {
                totalHealth = -1;
                break;
            }
        }
        System.out.println(totalHealth);

    }

}
