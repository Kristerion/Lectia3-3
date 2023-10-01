public class ConversieStringLaTipuriPrimitive {
    public static void main(String[] args) {

            String text = "4444.5d";
            double doubleParse = Double.parseDouble(text);

            String text1 = "147895632";
            int intParse = Integer.parseInt(text1);

            String text2 = "2354.56f";
            float floatParse = Float.parseFloat(text2);

            String text3 = "tRue";
            boolean booleanParse = Boolean.parseBoolean(text3);

            String text4 = "120";
            byte byteParse = Byte.parseByte(text4);

            String text5 = "987654321987654321";
            long longParse = Long.parseLong(text5);

            String text6 = "32000";
            short shortParse = Short.parseShort(text6);
        }
    }