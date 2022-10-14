enum UggRockSize {
    bigun,
    quite_bigun,
    not_so_bigun,
}

enum UggRockType {
    speckily,
    ouchy_black,
    floaty,
    hot_hot_hot,
}


public class UggRock{
    private UggRockSize rockSize;
    private UggRockType rockType;

    public UggRock (UggRockSize newRockSize, UggRockType newRockType){
        rocksize = newRockSize;
        rockType = newRockType;
    }

    public int CalcStateValue (UggRockSize rockSize, UggRockType rockType) {
        public int workingStateValue = 0;
        switch (rockSize) {
        case UggRockSize.bigun:
        workingStateValue += 5;
        break;
        
        case UggRockSize.quite_bigun:
        workingStateValue += 3;
        break;
        
        case UggRockSize.not_so_bigun:
        workingStateValue += 1;
        break;
        }
    }
}