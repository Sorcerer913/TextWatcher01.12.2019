package maestro.go.textwatcher01122019;

public class StringTester{
    public boolean contains(String string, String[] array){
        for (String str: array) {
            if(!string.contains(str)){
                return false;
            }
        }
        return true;
    }
    public boolean contains(String string, String[] array, boolean shiftIsMatter){
        if(shiftIsMatter){
            for (String str: array) {
                if(!string.contains(str)){
                    return false;
                }
            }
            return true;
        }else{
            for (String str: array) {
                if(!string.toLowerCase().contains(str.toLowerCase())){
                    return false;
                }
            }
            return true;
        }
    }

}
