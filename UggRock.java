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
        int workingStateValue = 0;
        switch (rockSize) {
        case bigun:
        workingStateValue += 5;
        break;
        
        case quite_bigun:
        workingStateValue += 3;
        break;
        
        case not_so_bigun:
        workingStateValue += 1;
        break;
        }

        switch (rockType) {
        case speckily:
        workingStateValue += 7;
        break;
        
        case ouchy_black:
        workingStateValue += 20;
        break;
        
        case floaty:
        workingStateValue += 2;
        break;

        case hot_hot_hot:
        workingStateValue += 15;
        break;
        }
        return workingStateValue;
    }

    public int getVal (){
        int value = CalcStateValue(self.rockSize, self.rockType);
        return value; 
    }

UggRock Terry = new UggRock (UggRockType.speckily, UggRockSize.quite_bigun);

}