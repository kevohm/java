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
        Set<String> selectedCol = collections.get(0);
        Set<String> allCommonCards = new HashSet<>();
        for(String item : selectedCol){   
           for(Set<String> collection:collections){
               // if item is in collection and all previous collections in list
               if(collection.contains(item)){
                   allCommonCards.add(item);
               }else{
                   allCommonCards.remove(item);
               }
           }
        }
        return allCommonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCommonCards = new HashSet<>();
        for(Set<String> collection:collections){
            for(String item : collection){
                //hash set always checks if item is in set anyways
                    allCommonCards.add(item);
            }
        }
        return allCommonCards;
    }
}
