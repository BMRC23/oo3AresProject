public class Litter implements ConsumableItem {
    @Override
    public boolean isEatenBy(Snake snake) {
        // Check if the snake can eat the litter, return true if successful
        return true;
    }
}