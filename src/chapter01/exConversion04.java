package chapter01;

public class exConversion04 {
    public static void main(String[] args) {
        int inum = 1000;
        byte bnum = (byte)inum;

        System.out.println(bnum);

        double dnum = 1.2;
        float fnum = 0.9f;

        int inum2 = (int)dnum + (int)fnum;
        int inum3 = (int)(dnum + fnum);

        System.out.println(inum2);
        System.out.println(inum3);
    }
}
