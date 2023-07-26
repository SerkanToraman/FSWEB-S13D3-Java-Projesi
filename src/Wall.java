public class Wall {
    double width;
    double height;
    public Wall(double width,double height) {
        checkWidth(width);
        checkHeight(height);
    }

    public double getWidth(){return width;}
    public double getHeight(){return height;}

    public void setWidth(double width) {
        checkWidth(width);
    }

    public void setHeight(double height) {
        checkHeight(height);
    }

    public void checkWidth (double width ){
       this.width=width<0?0:width;
    }
    public void checkHeight (double height ){
        this.height=height<0?0:height;
    }
    public double getArea(){
        return this.width * this.height;
    }
}
