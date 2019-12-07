package maestro.go.textwatcher01122019;

public class StringTester{
    //TODO: always false when string.length() > 8       it's no good
    //TODO: make it working...
    public boolean contains(String string, String[] array){     //  Returns True if Something in Array includes in String
        for (byte i = 0; i < string.length(); i++ ) {
            if(string.contains(array[i])){
                return true;
            }
        }
        return false;
    }
    /*public boolean contains(String string, String[] array, boolean shiftIsMatter){
        if(shiftIsMatter){
            for (String str: array) {
                if(string.contains(str)){
                    return ___;
                }
            }
            return ___;
        }else{
            for (String str: array) {
                if(string.toLowerCase().contains(str.toLowerCase())){
                    return ___;
                }
            }
            return ___;
        }
    }*/

}
