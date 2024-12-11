package codePTIT.J04011;

public class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D){
        Point3D AB = new Point3D((short) (B.x - A.x), (short) (B.y - A.y), (short) (B.z - A.z));
        Point3D AC = new Point3D((short) (C.x - A.x), (short) (C.y - A.y), (short) (C.z - A.z));
        Point3D AD = new Point3D((short) (D.x - A.x), (short) (D.y - A.y), (short) (D.z - A.z));
        Point3D ABAC = new Point3D((short) (AB.y * AC.z - AB.z * AC.y), (short) (AB.z * AC.x - AB.x * AC.z), (short) (AB.x * AC.y - AB.y * AC.x));
        int s = ABAC.x * AD.x + ABAC.y * AD.y + ABAC.z * AD.z;
        return s == 0;
    }

}
