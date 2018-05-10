public class Main{
    public static void main(String[] args) {
        boolean coinResult = Coin.throwCoin();
        Computer[] computers = new Computer[]{
                new Computer("Computer_One"),
                new Computer("Computer_Two")
        };
        
        Functions.introduction(computers, computers.length, coinResult);

        for (int game = 1; game <= 3; game++) {
            if (coinResult) {
                computers[0].thrown();
                if (computers[0].result || computers[1].result) {
                    break;
                }
                computers[1].thrown();
                if (computers[0].result || computers[1].result) {
                    break;
                }
            } else {
                computers[1].thrown();
                if (computers[0].result || computers[1].result) {
                    break;
                }
                computers[0].thrown();
                if (computers[0].result || computers[1].result) {
                    break;
                }
            }
            Functions.draw(game, computers[0], computers[1]);
        }

    }
}