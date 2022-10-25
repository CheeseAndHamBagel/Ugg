package UggRock;
enum UggRockSize {
   // enum constants calling the enum constructors 
    bigun(Short.parseShort("5")),
    quite_bigun(Short.parseShort("3")),
    not_so_bigun(Short.parseShort("1"));

   private final short multiplierValue;

   // private enum constructor
   private UggRockSize(Short multiplierValue) {
      this.multiplierValue = multiplierValue;
   }
    public Short getMultiplierValue() {
        return multiplierValue;
   }
}

enum UggRockType {
    speckily (Short.parseShort("7")),
    ouchy_black (Short.parseShort("20")),
    floaty (Short.parseShort("2")),
    hot_hot_hot (Short.parseShort("15"));

    private final short multiplierValue;

    // private enum constructor
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
        int workingStateValue = rockSize.getMultiplierValue().intValue() * rockType.getMultiplierValue().intValue();
        return workingStateValue;
    }

    public int getVal (){
        int value = CalcStateValue(rockSize, rockType);
        return value; 
    }

    public UggRockSize getSize(){
            return this.rockSize;
    }

    public UggRockType getType(){
        return this.rockType;
    }
    
    public String getRockDataAsStrings (){
        return (this.rockSize.toString() + ", " + this.rockType.toString());
    }

public static void main(String[] args){
    UggRock Terry = new UggRock (UggRockSize.bigun, UggRockType.hot_hot_hot);
    System.out.println(Terry.getVal());
    System.out.println(Terry.getSize());
    System.out.println(Terry.getType());
    System.out.println(Terry.getRockDataAsStrings());
}
}