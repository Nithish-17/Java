package collection.map;

/*
The EnumMap class is a member of the Java Collections Framework and is not synchronized.
EnumMap is an ordered collection and they are maintained in the natural order of their keys (the natural order of keys means the order in which enum constants are declared inside the enum type).
It’s a high-performance map implementation, much faster than HashMap.
All keys of each EnumMap instance must be keys of a single enum type.
EnumMap doesn't allow a null key and throws NullPointerException when we attempt to insert the null key.
Iterators returned by the collection views are weakly consistent: they will never throw ConcurrentModificationException and they may or may not show the effects of any modifications to the map that occur while the iteration is in progress.
EnumMap is internally represented as arrays. This representation is extremely compact and efficient.

uses array for storing so extremely fast

if enum has MON,TUE,WED,THU

Day.MON → index 0
Day.TUE → index 1
Day.WED → index 2
Day.THU → index 3

if we put
map.put(Day.MON, "Gym");
map.put(Day.WED, "Meeting");

// orders follows enum order

vals array:

Index:   0        1        2          3
        ------------------------------------
vals =  ["Gym",   null,  "Meeting",   null]


EnumMap<EnumType, ValueType> map = new EnumMap<>(EnumType.class);
*/

public class EnumMapExmaple {
}
