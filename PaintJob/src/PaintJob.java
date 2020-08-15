public class PaintJob {
    public static void main(String[] args){
        double width = 3.4;
        double height = 2.1;
        double areaPerBucket = 1.5;
        int extraBuckets = 1;
        double area = 3.4;
        int getBucketCount = getBucketCount(width,height,areaPerBucket, extraBuckets);
        int getBucketCount1 = getBucketCount(width,height,areaPerBucket);
        int getBucketCount2 = getBucketCount(area,areaPerBucket);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBucket<0)
            return -1;

        double areaOfWall = width*height;
        int bucketsCovered = (int)Math.ceil(areaOfWall/areaPerBucket);
        int bucketsRequired = bucketsCovered-extraBucket;
        System.out.println("buckets required = "+bucketsRequired);
        return bucketsRequired;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0)
            return -1;

        double areaOfWall = width*height;
        int bucketsRequired = (int)Math.ceil(areaOfWall/areaPerBucket);
        System.out.println("buckets required = "+bucketsRequired);
        return bucketsRequired;

    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0d || areaPerBucket<=0d)
            return -1;

        int bucketsRequired = (int)Math.ceil(area/areaPerBucket);
        System.out.println("buckets required = "+bucketsRequired);
        return bucketsRequired;

    }
}
