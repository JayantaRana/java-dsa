public class ValidIP {
    public  static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.", -1);
        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
           if(part.isEmpty()){
            return false;
           }
           for(char c: part.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
           }
           try {
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return false;
            }
           } catch (NumberFormatException e) {
            return false;
           }
        }
        return true;
    }
}

