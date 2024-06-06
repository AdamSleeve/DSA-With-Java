package LinearAlgo;

public class LinearSearch_ii {
    public static void main(String[] args) {
        String naame = "AdamSleeve";
        char target = 'S';
        System.out.println(AlgoSaerch(naame, target));
    }
    static boolean AlgoSaerch(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
//if(target == str.toCharAt(i))