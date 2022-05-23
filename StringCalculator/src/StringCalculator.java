public class StringCalculator {

    public int add(String s) {
        String[] split = s.split(",|\n");
        int sum = 0;

        if(s.equals("")) {
            return 0;
        }

//        for (int i = 0; i < split.length; i++) {
//            sum += Integer.parseInt(split[i]);
//
//        }
        for (String num : split) {
            sum += Integer.parseInt(num);

        }
        return sum;
    }
}
