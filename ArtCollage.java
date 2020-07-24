/*************************************************************************
 *  Compilation:  javac ArtCollage.java
 *  Execution:    java ArtCollage
 *
 *  @author: Renesh Bhamidipati
 *
 *************************************************************************/

import java.awt.Color;

public class ArtCollage {

    // The original picture
    private Picture original;

    // The collage picture
    private Picture collage;

    // The collage Picture consists of collageDimension X collageDimension tiles
    private int collageDimension;

    // A tile consists of tileDimension X tileDimension pixels
    private int tileDimension;
    
    /*
     * One-argument Constructor
     * 1. set default values of collageDimension to 4 and tileDimension to 100
     * 2. initializes original with the filename image
     * 3. initializes collage as a Picture of tileDimension*collageDimension x tileDimension*collageDimension, 
     *    where each pixel is black (see all constructors for the Picture class).
     * 4. update collage to be a scaled version of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public ArtCollage (String filename) {
        this(filename,100,4);
    }


    /*
     * Three-arguments Constructor
     * 1. set default values of collageDimension to cd and tileDimension to td
     * 2. initializes original with the filename image
     * 3. initializes collage as a Picture of tileDimension*collageDimension x tileDimension*collageDimension, 
     *    where each pixel is black (see all constructors for the Picture class).
     * 4. update collage to be a scaled version of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public ArtCollage (String filename, int td, int cd) {
        collageDimension = cd;
        tileDimension = td;
        original = new Picture(filename);
        collage = new Picture(td*cd, td*cd);
        int h = original.height();
        int w = original.width();
        for (int c = 0; c < collage.width(); c++){
            for(int r = 0; r < collage.height(); r++){
                int columnx = (c*w)/collage.width();
                int rowx = (r*h)/collage.height();
                collage.set(c,r,original.get(columnx, rowx));
            }
        }
    }

    /*
     * Returns the collageDimension instance variable
     *
     * @return collageDimension
     */
    public int getCollageDimension() {
        return collageDimension;
    }

    /*
     * Returns the tileDimension instance variable
     *
     * @return tileDimension
     */
    public int getTileDimension() {
        return tileDimension;
    }

    /*
     * Returns original instance variable
     *
     * @return original
     */
    public Picture getOriginalPicture() {
        return original;
    }

    /*
     * Returns collage instance variable
     *
     * @return collage
     */
    public Picture getCollagePicture() {
        return collage;
    }
    
    /*
     * Display the original image
     * Assumes that original has been initialized
     */
    public void showOriginalPicture() {
        original.show();
    }

    /*
     * Display the collage image
     * Assumes that collage has been initialized
     */
    public void showCollagePicture() {
        collage.show();
    }

    /*
     * Replaces the tile at collageCol,collageRow with the image from filename
     * Tile (0,0) is the upper leftmost tile
     *
     * @param filename image to replace tile
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void replaceTile (String filename,  int collageCol, int collageRow) {
        Picture replacementPic = new Picture(filename);
        for(int c = 0; c < collage.width(); c++){
            for(int r = 0; r < collage.height(); r++){
                if(c/tileDimension == collageCol && r/tileDimension == collageRow){
                    int col = (c % tileDimension) * collageDimension * replacementPic.width()/ collage.width();
                    int row = (r % tileDimension) * collageDimension * replacementPic.height()/ collage.height();
                    Color color = replacementPic.get(col,row);
                    collage.set(c,r,color);
                }
            }
        }
    }
    
    /*
     * Makes a collage of tiles from original Picture
     * original will have collageDimension x collageDimension tiles, each tile
     * has tileDimension X tileDimension pixels
     */
    public void makeCollage () {
        for(int c = 0; c < collage.width(); c++){
            for(int r = 0; r < collage.height(); r++){
                int col = (c%tileDimension)*collageDimension*original.width()/collage.width();
                int row = (r%tileDimension)*collageDimension*original.height()/collage.height();
                Color color = original.get(col,row);
                collage.set(c,r,color);
            }
        }
    }

    /*
     * Colorizes the tile at (collageCol, collageRow) with component 
     * (see Week 9 slides, the code for color separation is at the 
     *  book's website)
     *
     * @param component is either red, blue or green
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void colorizeTile (String component,  int collageCol, int collageRow) {
        for(int c = 0; c < collage.width(); c++){
            for(int r = 0; r < collage.height(); r++){
                if(c/tileDimension == collageCol && r/tileDimension == collageRow){
                    Color color = collage.get(c,r);
                    if (component == "blue"){
                        getCollagePicture().set(c, r, new Color(0, 0, color.getBlue()));
                    }
                    else if (component == "red"){
                        getCollagePicture().set(c, r, new Color(color.getRed(), 0, 0));
                    }
                    else if (component == "green"){
                        getCollagePicture().set(c, r, new Color(0, color.getGreen(), 0));
                    }
                }
            }
        }
    }

   
    /*
     * Greyscale tile at (collageCol, collageRow)
     * (see Week 9 slides, the code for luminance is at the book's website)
     *
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void greyscaleTile (int collageCol, int collageRow) {
        for(int col = 0; col < collage.width(); col++){
            for (int row = 0; row< collage.height(); row++){
                Color color = collage.get(col, row);
                if(col/tileDimension == collageCol && row/tileDimension == collageRow){
                    Color gray = Luminance.toGray(color);
                    collage.set(col, row, gray);
                }
            }
        }
    }

    // Test client 
    public static void main (String[] args) {
        //String filename = args[0];
        //StdOut.println(filename);
        //String secondPic = args[1];
        //ArtCollage ac = new ArtCollage(args[0]);
        ArtCollage ac = new ArtCollage(args[0], 200, 3);
        //Picture pic = ac.getOriginalPicture();
        //StdOut.println("Width: "+pic.width());
        //StdOut.println("Height: "+pic.height());
        //Picture col = ac.getCollagePicture();
        //StdOut.println("Width: "+col.width());
        //StdOut.println("Height: "+col.height());
        ac.makeCollage();
        //ac.replaceTile(args[1],1,1);
        ac.replaceTile(args[1],1,0);
        //ac.replaceTile(args[3],1,1);
        //ac.colorizeTile("red",2,2);
        //ac.colorizeTile("blue",2,1);
        //ac.colorizeTile("green",0,0);
        //ac.greyscaleTile(1,0);
        ac.showCollagePicture();
    }
}
