enum UggRockSize {
    bigun,
    quite_bigun,
    not_so_bigun,
}

enum UggRockType {
    speckily (Short.parseShort("7")),
    ouchy_black (Short.parseShort("20")),
    floaty (Short.parseShort("2")),
    hot_hot_hot (Short.parseShort("15"));

    private final short multiplierValue;

    private UggRockType (short multiplierValue) {
        this.multiplierValue = multiplierValue;
    }
    public Short getMultiplierValue() {
        return multiplierValue;
    }
}


public class UggRock{
    private UggRockSize rockSize;
    private UggRockType rockType;

    public UggRock (UggRockSize newRockSize, UggRockType newRockType){
        this.rockSize = newRockSize;
        this.rockType = newRockType;
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
        int value = CalcStateValue(rockSize, rockType);
        return value; 
    }

    public String getSize(){
        switch (this.rockSize) {
            case bigun:
            return ("bigun");
            case quite_bigun:
            return ("quite-bigun");
            case not_so_bigun:
            return ("not_so_bigun");
            default:
            return ("getSize error");

        }
    }

    public String getType(){
        switch (this.rockType) {
            case speckily:
            return ("bigun");
            case ouchy_black:
            return ("quite-bigun");
            case floaty:
            return ("not_so_bigun");
            case hot_hot_hot:
            return ("hot_hot_hot");
            default:
            return ("getType error");
        }
    }
public static void main(String[] args){
    UggRock Terry = new UggRock (UggRockSize.bigun, UggRockType.hot_hot_hot);
    System.out.println(Terry.getVal());
    System.out.println(Terry.getSize());
    System.out.println(Terry.getType());
}
}