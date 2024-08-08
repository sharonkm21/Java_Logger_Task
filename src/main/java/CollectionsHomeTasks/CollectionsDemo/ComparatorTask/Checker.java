package CollectionsHomeTasks.CollectionsDemo.ComparatorTask;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // Compare by score in descending order
        if (a.score != b.score) {
            return b.score - a.score; // Descending order
        } else {
            // If scores are equal, compare by name in alphabetical order
            return a.name.compareTo(b.name);
        }
    }

}
