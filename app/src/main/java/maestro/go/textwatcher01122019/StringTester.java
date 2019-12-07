package maestro.go.textwatcher01122019;

public class StringTester{
    public boolean contains(String string, String[] array){     //  Returns True if Something in Array includes in String
        for (String str: array) {
            if(string.contains(str)){
                return true;
            }
        }
        return false;
    }
    public boolean contains(String string, String[] array, boolean shiftIsMatter){
        if(shiftIsMatter){
            for (String str: array) {
                if(string.contains(str)){
                    return true;
                }
            }
            return false;
        }else{
            for (String str: array) {
                if(string.toLowerCase().contains(str.toLowerCase())){
                    return true;
                }
            }
            return false;
        }
    }

}
