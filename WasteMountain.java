public class WasteMountain implements ConsumableItem {
    @Override
    public boolean isEatenBy(Snake snake) {
        // Check if the snake can eat the waste mountain, return true if successful
        return true;
    }
}