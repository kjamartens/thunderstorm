package ThunderSTORM.utils;

import static java.lang.Math.round;
import java.util.Comparator;

public class Point<T extends Number> {

    public T x, y, val;

    public Point() {
        this.x = null;
        this.y = null;
        this.val = null;
    }

    public Point(T x, T y, T val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
        this.val = null;
    }
    
    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public T getVal() {
        return val;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public void setLocation(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public void set(T x, T y, T val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }
    
    public Point<Integer> roundToInteger() {
        assert ((x != null) && (y != null));

        if (val == null) {
            return new Point<Integer>(round(this.x.floatValue()), round(this.y.floatValue()));
        } else {
            return new Point<Integer>(round(this.x.floatValue()), round(this.y.floatValue()), round(this.val.floatValue()));
        }
    }
    
    public Point<Long> roundToLong() {
        assert ((x != null) && (y != null));

        if (val == null) {
            return new Point<Long>(round(this.x.doubleValue()), round(this.y.doubleValue()));
        } else {
            return new Point<Long>(round(this.x.doubleValue()), round(this.y.doubleValue()), round(this.val.doubleValue()));
        }
    }

    public Point<Integer> toInteger() {
        assert ((x != null) && (y != null));

        if (val == null) {
            return new Point<Integer>(this.x.intValue(), this.y.intValue());
        } else {
            return new Point<Integer>(this.x.intValue(), this.y.intValue(), this.val.intValue());
        }
    }

    public Point<Float> toFloat() {
        assert ((x != null) && (y != null));

        if (val == null) {
            return new Point<Float>(this.x.floatValue(), this.y.floatValue());
        } else {
            return new Point<Float>(this.x.floatValue(), this.y.floatValue(), this.val.floatValue());
        }
    }

    public Point<Byte> toByte() {
        assert ((x != null) && (y != null));

        if (val == null) {
            return new Point<Byte>(this.x.byteValue(), this.y.byteValue());
        } else {
            return new Point<Byte>(this.x.byteValue(), this.y.byteValue(), this.val.byteValue());
        }
    }

    public Point<Double> toDouble() {
        assert ((x != null) && (y != null));

        if (val == null) {
            return new Point<Double>(this.x.doubleValue(), this.y.doubleValue());
        } else {
            return new Point<Double>(this.x.doubleValue(), this.y.doubleValue(), this.val.doubleValue());
        }
    }

    public Point<Long> toLong() {
        assert ((x != null) && (y != null));

        if (val == null) {
            return new Point<Long>(this.x.longValue(), this.y.longValue());
        } else {
            return new Point<Long>(this.x.longValue(), this.y.longValue(), this.val.longValue());
        }
    }

    public Point<Short> toShort() {
        assert ((x != null) && (y != null));

        if (val == null) {
            return new Point<Short>(this.x.shortValue(), this.y.shortValue());
        } else {
            return new Point<Short>(this.x.shortValue(), this.y.shortValue(), this.val.shortValue());
        }
    }

    @Override
    public String toString() {
        assert ((x != null) && (y != null));

        if (val == null) {
            return "[" + x.toString() + "," + y.toString() + "]";
        } else {
            return "[" + x.toString() + "," + y.toString() + "]=" + val.toString();
        }
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Point) {
            Point pt = (Point)o;
            return (x.equals(pt.x) && y.equals(pt.y) && val.equals(pt.val));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.x != null ? this.x.hashCode() : 0);
        hash = 79 * hash + (this.y != null ? this.y.hashCode() : 0);
        hash = 79 * hash + (this.val != null ? this.val.hashCode() : 0);
        return hash;
    }
    
    public static class XYComparator implements Comparator<Point> {
        @Override
        public int compare(Point p1, Point p2) {
            double px1 = p1.x.doubleValue(), px2 = p2.x.doubleValue();
            double py1 = p1.y.doubleValue(), py2 = p2.y.doubleValue();
            if(px1 == px2) return (int) java.lang.Math.ceil(py1 - py2);
            return (int) java.lang.Math.ceil(px1 - px2);
        }
    }
}
