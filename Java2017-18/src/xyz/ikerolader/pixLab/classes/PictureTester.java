package xyz.ikerolader.pixLab.classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/xyz/ikerolader/pixLab/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("src/xyz/ikerolader/pixLab/images/beach.jpg");
    beach.explore();
    beach.onlyBlue();
    beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("src/xyz/ikerolader/pixLab/images/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  /** Method to test greyscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("src/xyz/ikerolader/pixLab/images/beach.jpg");
    beach.explore();
    beach.greyscale();
    beach.explore();
  }
  
  /** Method to test fixUnderwater */
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("src/xyz/ikerolader/pixLab/images/water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/xyz/ikerolader/pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  

  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("src/xyz/ikerolader/pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("src/xyz/ikerolader/pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
    Picture caterpillar = new Picture("src/xyz/ikerolader/pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBottomToTop();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/xyz/ikerolader/pixLab/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("src/xyz/ikerolader/pixLab/images/snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("src/xyz/ikerolader/pixLab/images/seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  public static void testCopy2()
  {
	Picture canvas = new Picture("src/xyz/ikerolader/pixLab/images/640x480.jpg");
	Picture canvas2 = new Picture("src/xyz/ikerolader/pixLab/images/arch.jpg");
    canvas.copy2(canvas2, 0, 400, 0, 600);
    canvas.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/xyz/ikerolader/pixLab/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/xyz/ikerolader/pixLab/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testCopy();
	//testCopy2();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}