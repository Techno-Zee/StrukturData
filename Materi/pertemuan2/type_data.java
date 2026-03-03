package Materi.pertemuan2;

public class type_data {

    public static void main(String[] args) {

        byte type_byte = 127;
        System.out.printf(
                "BYTE\nvalue = %d\nminimum = %d\nmaximum = %d\nsize (byte)= %d\nsize (bit)= %d\n\n",
                type_byte,
                Byte.MIN_VALUE,
                Byte.MAX_VALUE,
                Byte.BYTES,
                Byte.SIZE);

        short type_short = 32767;
        System.out.printf(
                "SHORT\nvalue = %d\nminimum = %d\nmaximum = %d\nsize (byte)= %d\nsize (bit)= %d\n\n",
                type_short,
                Short.MIN_VALUE,
                Short.MAX_VALUE,
                Short.BYTES,
                Short.SIZE);

        int type_int = 2147483647;
        System.out.printf(
                "INT\nvalue = %d\nminimum = %d\nmaximum = %d\nsize (byte)= %d\nsize (bit)= %d\n\n",
                type_int,
                Integer.MIN_VALUE,
                Integer.MAX_VALUE,
                Integer.BYTES,
                Integer.SIZE);

        long type_long = 9223372036854775807L;
        System.out.printf(
                "LONG\nvalue = %d\nminimum = %d\nmaximum = %d\nsize (byte)= %d\nsize (bit)= %d\n\n",
                type_long,
                Long.MIN_VALUE,
                Long.MAX_VALUE,
                Long.BYTES,
                Long.SIZE);

        float type_float = 3.4028235E38F;
        System.out.printf(
                "FLOAT\nvalue = %f\nminimum = %e\nmaximum = %e\nsize (byte)= %d\nsize (bit)= %d\n\n",
                type_float,
                Float.MIN_VALUE,
                Float.MAX_VALUE,
                Float.BYTES,
                Float.SIZE);

        double type_double = 1.7976931348623157E308;
        System.out.printf(
                "DOUBLE\nvalue = %f\nminimum = %e\nmaximum = %e\nsize (byte)= %d\nsize (bit)= %d\n\n",
                type_double,
                Double.MIN_VALUE,
                Double.MAX_VALUE,
                Double.BYTES,
                Double.SIZE);

        char type_char = 'A';
        System.out.printf(
                "CHAR\nvalue = %c\nminimum = %d\nmaximum = %d\nsize (byte)= %d\nsize (bit)= %d\n\n",
                type_char,
                (int) Character.MIN_VALUE,
                (int) Character.MAX_VALUE,
                Character.BYTES,
                Character.SIZE);

        boolean type_boolean = true;
        System.out.printf(
                "BOOLEAN\nvalue = %b\npossible values = true / false\n(no fixed size defined by Java spec)\n",
                type_boolean);
    }
}
