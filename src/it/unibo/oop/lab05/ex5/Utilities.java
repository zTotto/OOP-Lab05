package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> newSet = new HashSet<>();
    	newSet.addAll(setB);
    	newSet.addAll(setA);
    	return newSet;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> newSet = new HashSet<>();
    	newSet.addAll(setB);
    	newSet.retainAll(setA);
    	return newSet;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> newSet1 = new HashSet<>();
    	Set<X> newSet2 = new HashSet<>();
    	newSet2 = setIntersection(setA, setB);
    	newSet1.addAll(setB);
    	newSet1.addAll(setA);
    	newSet1.removeAll(newSet2);
    	return newSet1;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	int a = new Random().nextInt(coll.size());
    		for (X b : coll) {
    			if (a==0) {
    				return b;
    			}
    			a--;
    		}
    	return null;
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
        return new Pair<>(getRandomElement(first),getRandomElement(second));
    }
}
