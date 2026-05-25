import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return Set.copyOf(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        int myColSize = myCollection.size();
        int theirColSize = theirCollection.size();
        if(myColSize == 0 ) return false;
        if( myColSize < theirColSize && theirCollection.containsAll(myCollection)) return false;
        return !myCollection.containsAll(theirCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> allCommonCards = new HashSet<>(collections.get(0));
        for(Set<String> collection:collections){   
            allCommonCards.retainAll(collection);
        }
        return allCommonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCommonCards = new HashSet<>();
        for(Set<String> collection:collections){
            allCommonCards.addAll(collection);
        }
        return allCommonCards;
    }
}
