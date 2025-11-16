class Swapnibble{

    public static void main(String[] args){
        byte x = 100;
        byte swapped = (byte)((x & 0x0F) << 4 | (x & 0xF0) >> 4);
        System.out.println(swapped);

    }
}