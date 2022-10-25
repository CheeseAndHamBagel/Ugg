import java.util.Random;

public class Ugg{
    static class NestedUggRockSize{
        // enum constants calling the enum constructors 
        enum UggRockSize{
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
    }
    static class NestedUggRockType{
        enum UggRockType{
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
    }

    static class UggRock{
        private NestedUggRockSize.UggRockSize rockSize;
        private NestedUggRockType.UggRockType rockType;
    
        public UggRock (NestedUggRockSize.UggRockSize newRockSize, NestedUggRockType.UggRockType newRockType){
            this.rockSize = newRockSize;
            this.rockType = newRockType;
        }
    
       public int CalcStateValue (NestedUggRockSize.UggRockSize rockSize, NestedUggRockType.UggRockType rockType) {
            int workingStateValue = rockSize.getMultiplierValue().intValue() * rockType.getMultiplierValue().intValue();
            return workingStateValue;
        }
    
        public int getVal (){
            int value = CalcStateValue(rockSize, rockType);
            return value; 
        }
    
        public NestedUggRockSize.UggRockSize getSize(){
                return this.rockSize;
        }
    
        public NestedUggRockType.UggRockType getType(){
            return this.rockType;
        }
        
        public String getRockDataAsStrings (){
            return (this.rockSize.toString() + ", " + this.rockType.toString());
        }
    }

    public static Ugg.UggRock drawRock (){
        // ratio 6:2:1      | not-so : quite : bigun
        // ratio 1:1:1:1    all rockTypes
        Random generator = new Random();
        double sizeValue = generator.nextDouble();
        double typeValue = generator.nextDouble();
        // debug prints to check values are returning randoms and generate expected types and sizes
        System.out.println (sizeValue);
        System.out.println (typeValue);
        NestedUggRockSize.UggRockSize newUggRockSize;
        NestedUggRockType.UggRockType newUggRockType;

        if (sizeValue < (0.111111)){
            newUggRockSize = NestedUggRockSize.UggRockSize.bigun;
        }
        else if (sizeValue < (0.333333)){
            newUggRockSize = NestedUggRockSize.UggRockSize.quite_bigun;
        }
        else{
            newUggRockSize = NestedUggRockSize.UggRockSize.not_so_bigun;
        }

        if (typeValue < (0.25)){
            newUggRockType = NestedUggRockType.UggRockType.ouchy_black;
        }
        else if (typeValue < (0.50)){
            newUggRockType = NestedUggRockType.UggRockType.hot_hot_hot;
        }
        else if (typeValue < (0.75)){
            newUggRockType = NestedUggRockType.UggRockType.speckily;
        }
        else{
            newUggRockType = NestedUggRockType.UggRockType.floaty;
        }  

        return new UggRock(newUggRockSize, newUggRockType);
    }
public static void main(String[] args){
    /* 
    UggRock Terry = new UggRock (NestedUggRockSize.UggRockSize.bigun, NestedUggRockType.UggRockType.hot_hot_hot);
    System.out.println("First rock Terry; expected value 75, data 'bigun', 'hot_hot_hot'");
    System.out.println(Terry.getVal());
    System.out.println(Terry.getRockDataAsStrings());
    System.out.println();

    Ugg.UggRock RandomRock = drawRock();
    System.out.println("Second rock RandomRock; no expected value, should be random. If getVal() always returns a value 20, investigate as these are default values");
    System.out.println(RandomRock.getVal());
    System.out.println(RandomRock.getRockDataAsStrings());
    System.out.println();
    */
        
    int bigunCount = 0;
    int quiteBigunCount = 0;
    int notSoBigunCount = 0;
    int ouchyBlackCount = 0;
    int hotHotHotCount = 0;
    int speckilyCount = 0;
    int floatyCount = 0;

    for (int i = 0; i < 5; i++){
        Ugg.UggRock TestingRock = drawRock();
        System.out.println(TestingRock.getRockDataAsStrings());
        switch (TestingRock.rockSize){
            case bigun:
                bigunCount += 1;
            case quite_bigun:
                bigunCount += 1;
            case not_so_bigun:
                notSoBigunCount += 1;
            default:
                System.out.println("Rock has no size");
        }
        switch (TestingRock.rockType){
            case ouchy_black:
                ouchyBlackCount += 1;
            case hot_hot_hot:
                hotHotHotCount += 1;
            case speckily:
                speckilyCount += 1;
            case floaty:
                floatyCount += 1;
            default:
                System.out.println("Rock has no type");
        }
        System.out.println();
    }
    int sizeCount = bigunCount + quiteBigunCount + notSoBigunCount;
    int typeCount = ouchyBlackCount + hotHotHotCount + speckilyCount + floatyCount;
    System.out.println();
    System.out.println("sizeCount: " + sizeCount);
    System.out.println("typeCount: " + typeCount);
    System.out.println();
    System.out.println("Size counts:");
    System.out.println("bigun:        " + bigunCount);
    System.out.println("quite_bigun:  " + quiteBigunCount);
    System.out.println("not_so_bigun: " + notSoBigunCount);
    System.out.println("Expected ratio 1:2:6");
    System.out.println();
    System.out.println("Type counts:");
    System.out.println("ouchy_black: " + ouchyBlackCount);
    System.out.println("hot_hot_hot: " + hotHotHotCount);
    System.out.println("speckily:    " + speckilyCount);
    System.out.println("floaty:      " + floatyCount);
    System.out.println("Expected ratio 1:1:1:1");
    System.out.println();
}
}