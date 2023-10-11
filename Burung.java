import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Burung extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private int frame = 1;
    private int animationDelay = 10;
    private int speed = 5; // Kecepatan gerakan Burung
    private int direction = 1; // 1 untuk bergerak ke atas, -1 untuk bergerak ke bawah
    private int maxY = 400; // Batas atas
    private int minY = 100; // Batas bawah

    public void act() {
        animate();
        // Gerakkan burung ke atas dan ke bawah
        setLocation(getX(), getY() + (speed * direction));

        // Ganti arah gerakan jika burung mencapai batas atas atau bawah
        if (getY() >= maxY) {
            direction = -1; // Ubah arah ke bawah
        } else if (getY() <= minY) {
            direction = 1; // Ubah arah ke atas
        }
    }
    
    public Burung()
    {
        image1 = new GreenfootImage("1.png");
        image2 = new GreenfootImage("2.png");
        image3 = new GreenfootImage("3.png");
        setImage(image1);
    }

    private void animate()
    {
        if (frame == animationDelay)
        {
            switchImage();
            frame = 1;
        }
        else
        {
            frame++;
        }
    }

    private void switchImage()
    {
        if (getImage() == image1)
        {
            setImage(image2);
        }
        else if (getImage() == image2)
        {
            setImage(image3);
        }
        else
        {
            setImage(image1);
        }
    }
}
