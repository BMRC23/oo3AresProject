public class TrashHeap implements ConsumableItem {
    @Override
    public boolean isEatenBy(Snake snake) {
        // Check if the snake can eat the trash heap, return true if successful
        return true;
    }
}