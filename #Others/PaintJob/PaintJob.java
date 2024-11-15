
public class PaintJob {

    public static void main (String[] args) {
        System.out.print(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.print(getBucketCount(3.4, 2.1, 1.5));
        System.out.print(getBucketCount(6.26, 2.2));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        boolean isInvalid = (width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0);
        if (isInvalid) {
            return -1;
        }

        double areaToPaint = width * height;
        double requiredBuckets = areaToPaint / areaPerBucket;
        return (int) (Math.ceil(requiredBuckets - extraBuckets));
    }

    public static int  getBucketCount (double width, double height, double areaPerBucket) {
        boolean isInvalid = (width <= 0) || (height <= 0) || (areaPerBucket <= 0);
        if (isInvalid) {
            return -1;
        }

        double areaToPaint = width * height;
        double requiredBuckets = areaToPaint / areaPerBucket;
        return (int) (Math.ceil(requiredBuckets));
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        boolean isInvalid = (area <= 0) || (areaPerBucket <= 0);
        if (isInvalid) {
            return -1;
        }

        return (int) (Math.ceil(area / areaPerBucket));
    }
}
